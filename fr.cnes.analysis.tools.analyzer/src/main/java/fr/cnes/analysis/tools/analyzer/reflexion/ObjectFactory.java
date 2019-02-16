/************************************************************************************************/
/* i-Code CNES is a static code analyzer.                                                       */
/* This software is a free software, under the terms of the Eclipse Public License version 1.0. */
/* http://www.eclipse.org/legal/epl-v10.html                                                    */
/************************************************************************************************/
package fr.cnes.analysis.tools.analyzer.reflexion;

/**
 * Utility class for instantiate objects from class.
 *
 * @author lequal
 */
public class ObjectFactory {

    public static Object createInstance(final Class<?> cls) throws Exception {
        return cls.newInstance();
    }

}
