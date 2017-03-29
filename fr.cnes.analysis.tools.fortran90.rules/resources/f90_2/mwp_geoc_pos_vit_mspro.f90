module mwp_geoc_pos_vit_mspro

! (C) Copyright CNES - MSPRO - 2002

!************************************************************************
!
! But:  Module interne de surcharge de l'operateur d'egalite pour des
! ===   donnees geocentriques (Latitude, Longitude, distance)               
!
! Note d'utilisation: accessible via les modules de surcharge
! ==================  Ces procedures possedent deux arguments obligatoires :
!                     Le premier , du genre intent(out) correspond
!                     a celui qui apparait a gauche du signe "=",
!                     Le second , du genre intent(in) correspond a celui
!                     qui apparait a droite du signe "=".
!
!$Historique
! ==========
!   + Version 3.0 : creation
!                         (Date: 11/2002 - Realisation: Michel Lagreca)
!   + Version 5.6 : DM-ID 548 : diminution du nombre de fichiers sources
!                   (Date: 10/2006 - Realisation: Atos origin)
!
!VERSION:V5.15:FA-ID:1398:30/09/2010:Ajout marqueur fin historique
!
!$FinHistorique
!
!************************************************************************

use mslib              ! acces a la librairie MSLIB
use type_mspro         ! acces aux types utilisateurs de la librairie MSPRO
use type_themeX_interne_mspro ! acces en interne aux types du theme X

implicit none

! SVN Source File Id
  character(len=256), private :: SVN_VER =  '$Id: mwp_geoc_pos_vit_mspro.f90 69 2012-09-11 08:33:34Z ffsm $'


character(len=pm_longueur_info_utilisateur),private :: info_utilisateur = &
                    '@(#) Fichier MSPRO mwp_geoc_pos_vit_mspro.f90: derniere modification V5.15 >'

! definition de l'interface de la surcharge

interface assignment (=)

   module procedure mwpi_geoc_2_geoc

   module procedure mwpi_tab3_2_geoc
   module procedure mwpi_geoc_2_tab3
   module procedure mwpi_pos_vit_geoc_2_tab6
   module procedure mwpi_tab6_2_pos_vit_geoc

end interface

CONTAINS

subroutine mwpi_geoc_2_geoc (coord_geoc_out, coord_geoc_in)

! (C) Copyright CNES - MSPRO - 2002

!************************************************************************
!
! But:  Transfert de coordonnees tm_geocentrique vers des coordonnees tm_geocentrique
! ===   (ceci evite des transferts implicites)
!
! Note d'utilisation: 
! ==================
!
!$Historique
! ==========
!   + Version 3.0 : creation
!                         (Date: 11/2002 - Realisation: Michel Lagreca)
!
!VERSION:V5.15:FA-ID:1398:30/09/2010:Ajout marqueur fin historique
!
!$FinHistorique
!
!************************************************************************

! Declarations
! ============

type(tm_geocentrique), intent(out) :: coord_geoc_out  ! resultat
type(tm_geocentrique), intent(in)  :: coord_geoc_in   ! operande

! Corps du sous programme
! =======================

coord_geoc_out%lat  = coord_geoc_in%lat
coord_geoc_out%long = coord_geoc_in%long
coord_geoc_out%dist = coord_geoc_in%dist

end subroutine mwpi_geoc_2_geoc

subroutine mwpi_tab3_2_geoc (coord_geoc, coord_tab3)

! (C) Copyright CNES - MSPRO - 2002

!************************************************************************
!
! But:  Transfert des coordonnees (latitude/longitude/distance)
! ===   contenues dans un tableau coord_tab3 de dimension 3 vers des 
!       coordonnees tm_geoc . Cette methode est valable pour des positions
!       ou des vitesses.
!
! Note d'utilisation: 
! ==================
!
!$Historique
! ==========
!   + Version 3.0 : creation
!                         (Date: 11/2002 - Realisation: Michel Lagreca)
!
!VERSION:V5.15:FA-ID:1398:30/09/2010:Ajout marqueur fin historique
!
!$FinHistorique
!
!************************************************************************

! Declarations
! ============

type(tm_geocentrique), intent(out)       :: coord_geoc   ! resultat
real(pm_reel), dimension(3), intent(in)  :: coord_tab3   ! operande

! Corps du sous programme
! =======================

coord_geoc%lat  = coord_tab3(1)
coord_geoc%long = coord_tab3(2)
coord_geoc%dist = coord_tab3(3)

end subroutine mwpi_tab3_2_geoc

subroutine mwpi_geoc_2_tab3 (coord_tab3, coord_geoc)

! (C) Copyright CNES - MSPRO - 2002

!************************************************************************
!
! But:  Transfert des coordonnees tm_geoc en tableau coord_tab3 de 
! ===   coordonnees de dimension 3(latitude/longitude/distance)  
!       Cette methode est valable pour des positions ou des vitesses.
!       ou des vitesses.
!
! Note d'utilisation: 
! ==================
!
!$Historique
! ==========
!   + Version 3.0 : creation
!                         (Date: 11/2002 - Realisation: Michel Lagreca)
!
!VERSION:V5.15:FA-ID:1398:30/09/2010:Ajout marqueur fin historique
!
!$FinHistorique
!
!************************************************************************

! Declarations
! ============

real(pm_reel), dimension(3), intent(out) :: coord_tab3   ! resultat
type(tm_geocentrique), intent(in)        :: coord_geoc   ! operande

! Corps du sous programme
! =======================

coord_tab3(1) = coord_geoc%lat
coord_tab3(2) = coord_geoc%long
coord_tab3(3) = coord_geoc%dist

end subroutine mwpi_geoc_2_tab3

subroutine mwpi_tab6_2_pos_vit_geoc (pos_vit_geoc, coord_tab6)

! (C) Copyright CNES - MSPRO - 2002

!************************************************************************
!
! But:  Transfert d'un tableau de coordonnees (positions et vitesses)
! ===   contenues dans un tableau coord_tab6 de dimension 6 vers des 
!       coordonnees pos_vit_geoc de type tm_i_geoc_pos_vit . 
!
! Note d'utilisation: 
! ==================
!
!$Historique
! ==========
!   + Version 3.0 : creation
!                         (Date: 11/2002 - Realisation: Michel Lagreca)
!
!VERSION:V5.15:FA-ID:1398:30/09/2010:Ajout marqueur fin historique
!
!$FinHistorique
!
!************************************************************************

! Declarations
! ============

type(tm_i_geoc_pos_vit), intent(out)     :: pos_vit_geoc    ! resultat
real(pm_reel), dimension(6), intent(in)  :: coord_tab6      ! operande

! Corps du sous programme
! =======================

pos_vit_geoc%pos = coord_tab6(1:3)! utilisation surcharge "=" en interne
pos_vit_geoc%vit = coord_tab6(4:6)! utilisation surcharge "=" en interne

end subroutine mwpi_tab6_2_pos_vit_geoc

subroutine mwpi_pos_vit_geoc_2_tab6 (coord_tab6, pos_vit_geoc)

! (C) Copyright CNES - MSPRO - 2002

!************************************************************************
!
! But:  Transfert des coordonnees pos_vit_geoc de type tm_i_geoc_pos_vit en  
! ===   tableau coord_tab6 de dimension 6  
!
! Note d'utilisation: 
! ==================
!
!$Historique
! ==========
!   + Version 3.0 : creation
!                         (Date: 11/2002 - Realisation: Michel Lagreca)
!
!VERSION:V5.15:FA-ID:1398:30/09/2010:Ajout marqueur fin historique
!
!$FinHistorique
!
!************************************************************************

! Declarations
! ============

real(pm_reel), dimension(6), intent(out) :: coord_tab6      ! resultat
type(tm_i_geoc_pos_vit), intent(in)      :: pos_vit_geoc    ! operande

! Corps du sous programme
! =======================

coord_tab6(1:3) = pos_vit_geoc%pos ! utilisation surcharge "=" en interne
coord_tab6(4:6) = pos_vit_geoc%vit ! utilisation surcharge "=" en interne

end subroutine mwpi_pos_vit_geoc_2_tab6

end module mwp_geoc_pos_vit_mspro