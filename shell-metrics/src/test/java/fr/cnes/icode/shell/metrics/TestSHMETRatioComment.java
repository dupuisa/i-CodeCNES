/************************************************************************************************/
/* i-Code CNES is a static code analyzer.                                                       */
/* This software is a free software, under the terms of the Eclipse Public License version 1.0. */
/* http://www.eclipse.org/legal/epl-v10.html                                                    */
/************************************************************************************************/

package fr.cnes.icode.shell.metrics;

import fr.cnes.icode.data.AbstractChecker;
import fr.cnes.icode.data.CheckResult;
import fr.cnes.icode.exception.JFlexException;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This class aims to test Don.Declaration rule. There are 2 functions in this
 * class. The first one verifies that an error in a file is detected whenever
 * there is one, the other verifies that nothing is detected when there's no
 * error.
 */
public class TestSHMETRatioComment {

    /**
     * This test verifies that an error can be detected.
     */
    @Test
    public void testRunWithError() {

        try {
            // Initializing rule and getting error file.
            final AbstractChecker metric = new SHMETRatioComment();
            final String fileName = "nvm.sh";
            final File file = new File(this.getClass().getResource(String.format("/%s", fileName)).getFile());

            // Defining file in the rule instantiation.
            metric.setInputFile(file);

            // We verify that the metric value detected is the right one.
            // Get the list and verify each value
            final List<CheckResult> checkResults = metric.run();
            CheckResult fileValue = null;
            for (CheckResult check : checkResults) {
                if (check.getLocation() == null || check.getLocation().isEmpty()) {
                    fileValue = check;
                    checkResults.remove(check);
                }
            }
            if (fileValue == null) {
                fail("Error: No issue found in the file.");
            } else {

                assertEquals(fileValue.getFile().getName(), fileName);
                float exceptedFileValue = 22.693726f;
                assertEquals(Math.round(fileValue.getValue()), Math.round(exceptedFileValue));

                Map<String, Float> exceptedValues = new TreeMap<>();
                exceptedValues.put("MAIN PROGRAM", (float) 22.693726);
                exceptedValues.put("nvm_add_iojs_prefix", Float.NaN);
                exceptedValues.put("nvm_alias", (float) 21.052631);
                exceptedValues.put("nvm_alias_path", Float.NaN);
                exceptedValues.put("nvm_binary_available", Float.NaN);
                exceptedValues.put("nvm_cd", Float.NaN);
                exceptedValues.put("nvm_clang_version", Float.NaN);
                exceptedValues.put("nvm_command_info", (float) 19.047619);
                exceptedValues.put("nvm_curl_libz_support", Float.NaN);
                exceptedValues.put("nvm_curl_use_compression", Float.NaN);
                exceptedValues.put("nvm_curl_version", Float.NaN);
                exceptedValues.put("nvm_download", (float) 24.0);
                exceptedValues.put("nvm_ensure_version_installed", (float) 12.5);
                exceptedValues.put("nvm_ensure_version_prefix", Float.NaN);
                exceptedValues.put("nvm_err", Float.NaN);
                exceptedValues.put("nvm_find_nvmrc", Float.NaN);
                exceptedValues.put("nvm_find_up", Float.NaN);
                exceptedValues.put("nvm_format_version", (float) 15.384616);
                exceptedValues.put("nvm_get_latest", (float) 16.666668);
                exceptedValues.put("nvm_grep", Float.NaN);
                exceptedValues.put("nvm_has", Float.NaN);
                exceptedValues.put("nvm_has_colors", Float.NaN);
                exceptedValues.put("nvm_has_non_aliased", Float.NaN);
                exceptedValues.put("nvm_has_system_iojs", Float.NaN);
                exceptedValues.put("nvm_has_system_node", Float.NaN);
                exceptedValues.put("nvm_install_latest_npm", (float) 7.4626865);
                exceptedValues.put("nvm_iojs_prefix", Float.NaN);
                exceptedValues.put("nvm_is_alias", Float.NaN);
                exceptedValues.put("nvm_is_iojs_version", Float.NaN);
                exceptedValues.put("nvm_is_valid_version", (float) 20.0);
                exceptedValues.put("nvm_is_version_installed", Float.NaN);
                exceptedValues.put("nvm_ls_current", (float) 18.181818);
                exceptedValues.put("nvm_ls_remote_index_tab", (float) 4.6728973);
                exceptedValues.put("nvm_ls_remote_iojs", Float.NaN);
                exceptedValues.put("nvm_make_alias", (float) 21.052631);
                exceptedValues.put("nvm_node_prefix", Float.NaN);
                exceptedValues.put("nvm_normalize_version", Float.NaN);
                exceptedValues.put("nvm_num_version_groups", (float) 21.052631);
                exceptedValues.put("nvm_prepend_path", Float.NaN);
                exceptedValues.put("nvm_print_alias_path", (float) 12.5);
                exceptedValues.put("nvm_print_formatted_alias", (float) 5.0847454);
                exceptedValues.put("nvm_print_npm_version", Float.NaN);
                exceptedValues.put("nvm_rc_version", (float) 25.0);
                exceptedValues.put("nvm_remote_version", (float) 12.5);
                exceptedValues.put("nvm_remote_versions", (float) 6.557377);
                exceptedValues.put("nvm_resolve_alias", (float) 7.5471697);
                exceptedValues.put("nvm_resolve_local_alias", (float) 19.047619);
                exceptedValues.put("nvm_strip_iojs_prefix", Float.NaN);
                exceptedValues.put("nvm_strip_path", (float) 18.75);
                exceptedValues.put("nvm_tree_contains_path", (float) 20.0);
                exceptedValues.put("nvm_version", (float) 19.354837);
                exceptedValues.put("nvm_version_dir", (float) 22.222223);
                exceptedValues.put("nvm_version_greater", (float) 17.647058);
                exceptedValues.put("nvm_version_greater_than_or_equal_to", (float) 23.529411);
                exceptedValues.put("nvm_version_path", (float) 22.222223);
                exceptedValues.put("vm_ls_remote", (float) 25.0);
                for (CheckResult metricValue : checkResults) {
                    assertTrue(exceptedValues.containsKey(metricValue.getLocation()));
                    assertEquals(Math.round(metricValue.getValue()), Math.round(exceptedValues.get(metricValue.getLocation())));
                }
                assertEquals(checkResults.size(), exceptedValues.size());
            }
        } catch (final FileNotFoundException e) {
            fail("Erreur d'analyse (FileNotFoundException)");
        } catch (final IOException e) {
            fail("Erreur d'analyse (IOException)");
        } catch (final JFlexException e) {
            fail("Erreur d'analyse (JFlexException)");
        }
    }
}
