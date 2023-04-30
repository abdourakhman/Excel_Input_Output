package com.example.ioexcel.io;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
    //*************************DEBUT DECLARATION VARIABLES***************************
        double anneeDebutPrevisionnelle;
        double totalEmlpois;
        double  nombreeEmploisTotalesCrees2011 ;
        double  nombreeEmploisTotalesCrees2012 ;
        double  nombreeEmploisTotalesCrees2013 ;
        double  nombreeEmploisTotalesCrees2014 ;
        double  nombreeEmploisTotalesCrees2015 ;
        double  nombreeEmploisTotalesCrees2016 ;
        double  nombreeEmploisTotalesCrees2017 ;
        double  nombreeEmploisTotalesCrees2018 ;
        double  nombreeEmploisTotalesCrees2019 ;
        double  nombreeEmploisTotalesCrees2020 ;
        double  nombreeEmploisTotalesCrees2021 ;
        double  nombreeEmploisTotalesCrees2022 ;
        double  nombreeEmploisTotalesCrees2023 ;
        double  nombreeEmploisTotalesCrees2024 ;
        double  nombreeEmploisTotalesCrees2025 ;
        double  nombreeEmploisTotalesCrees2026 ;
        double  nombreeEmploisTotalesCrees2027 ;
        double  nombreeEmploisTotalesCrees2028 ;
        double  nombreeEmploisTotalesCrees2029 ;
        double  nombreeEmploisTotalesCrees2030 ;
    
        double nombreEmploisDirectsCrees2011 ;
        double nombreEmploisDirectsCrees2012 ;
        double nombreEmploisDirectsCrees2013 ;
        double nombreEmploisDirectsCrees2014 ;
        double nombreEmploisDirectsCrees2015 ;
        double nombreEmploisDirectsCrees2016 ;
        double nombreEmploisDirectsCrees2017 ;
        double nombreEmploisDirectsCrees2018 ;
        double nombreEmploisDirectsCrees2019 ;
        double nombreEmploisDirectsCrees2020 ;
        double nombreEmploisDirectsCrees2021 ;
        double nombreEmploisDirectsCrees2022 ;
        double nombreEmploisDirectsCrees2023 ;
        double nombreEmploisDirectsCrees2024 ;
        double nombreEmploisDirectsCrees2025 ;
        double nombreEmploisDirectsCrees2026 ;
        double nombreEmploisDirectsCrees2027 ;
        double nombreEmploisDirectsCrees2028 ;
        double nombreEmploisDirectsCrees2029 ;
        double nombreEmploisDirectsCrees2030 ;
    
        double nombreEmploisIndirectsCrees2011 ;
        double nombreEmploisIndirectsCrees2012 ;
        double nombreEmploisIndirectsCrees2013 ;
        double nombreEmploisIndirectsCrees2014 ;
        double nombreEmploisIndirectsCrees2015 ;
        double nombreEmploisIndirectsCrees2016 ;
        double nombreEmploisIndirectsCrees2017 ;
        double nombreEmploisIndirectsCrees2018 ;
        double nombreEmploisIndirectsCrees2019 ;
        double nombreEmploisIndirectsCrees2020 ;
        double nombreEmploisIndirectsCrees2021 ;
        double nombreEmploisIndirectsCrees2022 ;
        double nombreEmploisIndirectsCrees2023 ;
        double nombreEmploisIndirectsCrees2024 ;
        double nombreEmploisIndirectsCrees2025 ;
        double nombreEmploisIndirectsCrees2026 ;
        double nombreEmploisIndirectsCrees2027 ;
        double nombreEmploisIndirectsCrees2028 ;
        double nombreEmploisIndirectsCrees2029 ;
        double nombreEmploisIndirectsCrees2030 ;
        
        double pourcentageSequençageInvestissements2011 ;
        double pourcentageSequençageInvestissements2012 ;
        double pourcentageSequençageInvestissements2013 ;
        double pourcentageSequençageInvestissements2014 ;
        double pourcentageSequençageInvestissements2015 ;
        double pourcentageSequençageInvestissements2016 ;
        double pourcentageSequençageInvestissements2017 ;
        double pourcentageSequençageInvestissements2018 ;
        double pourcentageSequençageInvestissements2019 ;
        double pourcentageSequençageInvestissements2020 ;
        double pourcentageSequençageInvestissements2021 ;
        double pourcentageSequençageInvestissements2022 ;
        double pourcentageSequençageInvestissements2023 ;
        double pourcentageSequençageInvestissements2024 ;
        double pourcentageSequençageInvestissements2025 ;
        double pourcentageSequençageInvestissements2026 ;
        double pourcentageSequençageInvestissements2027 ;
        double pourcentageSequençageInvestissements2028 ;
        double pourcentageSequençageInvestissements2029 ;
        double pourcentageSequençageInvestissements2030 ;
    
        double  investissementTourisqueEngage2011 ;
        double  investissementTourisqueEngage2012 ;
        double  investissementTourisqueEngage2013 ;
        double  investissementTourisqueEngage2014 ;
        double  investissementTourisqueEngage2015 ;
        double  investissementTourisqueEngage2016 ;
        double  investissementTourisqueEngage2017 ;
        double  investissementTourisqueEngage2018 ;
        double  investissementTourisqueEngage2019 ;
        double  investissementTourisqueEngage2020 ;
        double  investissementTourisqueEngage2021 ;
        double  investissementTourisqueEngage2022 ;
        double  investissementTourisqueEngage2023 ;
        double  investissementTourisqueEngage2024 ;
        double  investissementTourisqueEngage2025 ;
        double  investissementTourisqueEngage2026 ;
        double  investissementTourisqueEngage2027 ;
        double  investissementTourisqueEngage2028 ;
        double  investissementTourisqueEngage2029 ;
        double  investissementTourisqueEngage2030 ;
    
        double sequençageInvestissementTourisque2011 ;
        double sequençageInvestissementTourisque2012 ;
        double sequençageInvestissementTourisque2013 ;
        double sequençageInvestissementTourisque2014 ;
        double sequençageInvestissementTourisque2015 ;
        double sequençageInvestissementTourisque2016 ;
        double sequençageInvestissementTourisque2017 ;
        double sequençageInvestissementTourisque2018 ;
        double sequençageInvestissementTourisque2019 ;
        double sequençageInvestissementTourisque2020 ;
        double sequençageInvestissementTourisque2021 ;
        double sequençageInvestissementTourisque2022 ;
        double sequençageInvestissementTourisque2023 ;
        double sequençageInvestissementTourisque2024 ;
        double sequençageInvestissementTourisque2025 ;
        double sequençageInvestissementTourisque2026 ;
        double sequençageInvestissementTourisque2027 ;
        double sequençageInvestissementTourisque2028 ;
        double sequençageInvestissementTourisque2029 ;
        double sequençageInvestissementTourisque2030 ;
    
        double sequençageCapacite2011 ;
        double sequençageCapacite2012 ;
        double sequençageCapacite2013 ;
        double sequençageCapacite2014 ;
        double sequençageCapacite2015 ;
        double sequençageCapacite2016 ;
        double sequençageCapacite2017 ;
        double sequençageCapacite2018 ;
        double sequençageCapacite2019 ;
        double sequençageCapacite2020 ;
        double sequençageCapacite2021 ;
        double sequençageCapacite2022 ;
        double sequençageCapacite2023 ;
        double sequençageCapacite2024 ;
        double sequençageCapacite2025 ;
        double sequençageCapacite2026 ;
        double sequençageCapacite2027 ;
        double sequençageCapacite2028 ;
        double sequençageCapacite2029 ;
        double sequençageCapacite2030 ;
    
        double  EBITDAMDH2011 ;
        double  EBITDAMDH2012 ;
        double  EBITDAMDH2013 ;
        double  EBITDAMDH2014 ;
        double  EBITDAMDH2015 ;
        double  EBITDAMDH2016 ;
        double  EBITDAMDH2017 ;
        double  EBITDAMDH2018 ;
        double  EBITDAMDH2019 ;
        double  EBITDAMDH2020 ;
        double  EBITDAMDH2021 ;
        double  EBITDAMDH2022 ;
        double  EBITDAMDH2023 ;
        double  EBITDAMDH2024 ;
        double  EBITDAMDH2025 ;
        double  EBITDAMDH2026 ;
        double  EBITDAMDH2027 ;
        double  EBITDAMDH2028 ;
        double  EBITDAMDH2029 ;
        double  EBITDAMDH2030 ;
    
        double  InvestissementPublicEngagementEnMdh2011 ;
        double  InvestissementPublicEngagementEnMdh2012 ;
        double  InvestissementPublicEngagementEnMdh2013 ;
        double  InvestissementPublicEngagementEnMdh2014 ;
        double  InvestissementPublicEngagementEnMdh2015 ;
        double  InvestissementPublicEngagementEnMdh2016 ;
        double  InvestissementPublicEngagementEnMdh2017 ;
        double  InvestissementPublicEngagementEnMdh2018 ;
        double  InvestissementPublicEngagementEnMdh2019 ;
        double  InvestissementPublicEngagementEnMdh2020 ;
        double  InvestissementPublicEngagementEnMdh2021 ;
        double  InvestissementPublicEngagementEnMdh2022 ;
        double  InvestissementPublicEngagementEnMdh2023 ;
        double  InvestissementPublicEngagementEnMdh2024 ;
        double  InvestissementPublicEngagementEnMdh2025 ;
        double  InvestissementPublicEngagementEnMdh2026 ;
        double  InvestissementPublicEngagementEnMdh2027 ;
        double  InvestissementPublicEngagementEnMdh2028 ;
        double  InvestissementPublicEngagementEnMdh2029 ;
        double  InvestissementPublicEngagementEnMdh2030 ;
    
        double  InvestissementPrivéEngagementEnMdh2011 ;
        double  InvestissementPrivéEngagementEnMdh2012 ;
        double  InvestissementPrivéEngagementEnMdh2013 ;
        double  InvestissementPrivéEngagementEnMdh2014 ;
        double  InvestissementPrivéEngagementEnMdh2015 ;
        double  InvestissementPrivéEngagementEnMdh2016 ;
        double  InvestissementPrivéEngagementEnMdh2017 ;
        double  InvestissementPrivéEngagementEnMdh2018 ;
        double  InvestissementPrivéEngagementEnMdh2019 ;
        double  InvestissementPrivéEngagementEnMdh2020 ;
        double  InvestissementPrivéEngagementEnMdh2021 ;
        double  InvestissementPrivéEngagementEnMdh2022 ;
        double  InvestissementPrivéEngagementEnMdh2023 ;
        double  InvestissementPrivéEngagementEnMdh2024 ;
        double  InvestissementPrivéEngagementEnMdh2025 ;
        double  InvestissementPrivéEngagementEnMdh2026 ;
        double  InvestissementPrivéEngagementEnMdh2027 ;
        double  InvestissementPrivéEngagementEnMdh2028 ;
        double  InvestissementPrivéEngagementEnMdh2029 ;
        double  InvestissementPrivéEngagementEnMdh2030 ;
        double TO_A1, TO_A2, TO_A3;
        double   nuitees_millionsdenuitees2011 ;
        double   nuitees_millionsdenuitees2012 ;
        double   nuitees_millionsdenuitees2013 ;
        double   nuitees_millionsdenuitees2014 ;
        double   nuitees_millionsdenuitees2015 ;
        double   nuitees_millionsdenuitees2016 ;
        double   nuitees_millionsdenuitees2017 ;
        double   nuitees_millionsdenuitees2018 ;
        double   nuitees_millionsdenuitees2019 ;
        double   nuitees_millionsdenuitees2020 ;
        double   nuitees_millionsdenuitees2021 ;
        double   nuitees_millionsdenuitees2022 ;
        double   nuitees_millionsdenuitees2023 ;
        double   nuitees_millionsdenuitees2024 ;
        double   nuitees_millionsdenuitees2025 ;
        double   nuitees_millionsdenuitees2026 ;
        double   nuitees_millionsdenuitees2027 ;
        double   nuitees_millionsdenuitees2028 ;
        double   nuitees_millionsdenuitees2029 ;
        double   nuitees_millionsdenuitees2030 ;
    
        double    arriveesMillionsTouristes2011 ;
        double    arriveesMillionsTouristes2012 ;
        double    arriveesMillionsTouristes2013 ;
        double    arriveesMillionsTouristes2014 ;
        double    arriveesMillionsTouristes2015 ;
        double    arriveesMillionsTouristes2016 ;
        double    arriveesMillionsTouristes2017 ;
        double    arriveesMillionsTouristes2018 ;
        double    arriveesMillionsTouristes2019 ;
        double    arriveesMillionsTouristes2020 ;
        double    arriveesMillionsTouristes2021 ;
        double    arriveesMillionsTouristes2022 ;
        double    arriveesMillionsTouristes2023 ;
        double    arriveesMillionsTouristes2024 ;
        double    arriveesMillionsTouristes2025 ;
        double    arriveesMillionsTouristes2026 ;
        double    arriveesMillionsTouristes2027 ;
        double    arriveesMillionsTouristes2028 ;
        double    arriveesMillionsTouristes2029 ;
        double    arriveesMillionsTouristes2030 ;
    
        double arriveesTESMillionsTouristes2011 ;
        double arriveesTESMillionsTouristes2012 ;
        double arriveesTESMillionsTouristes2013 ;
        double arriveesTESMillionsTouristes2014 ;
        double arriveesTESMillionsTouristes2015 ;
        double arriveesTESMillionsTouristes2016 ;
        double arriveesTESMillionsTouristes2017 ;
        double arriveesTESMillionsTouristes2018 ;
        double arriveesTESMillionsTouristes2019 ;
        double arriveesTESMillionsTouristes2020 ;
        double arriveesTESMillionsTouristes2021 ;
        double arriveesTESMillionsTouristes2022 ;
        double arriveesTESMillionsTouristes2023 ;
        double arriveesTESMillionsTouristes2024 ;
        double arriveesTESMillionsTouristes2025 ;
        double arriveesTESMillionsTouristes2026 ;
        double arriveesTESMillionsTouristes2027 ;
        double arriveesTESMillionsTouristes2028 ;
        double arriveesTESMillionsTouristes2029 ;
        double arriveesTESMillionsTouristes2030 ;
    
        double  arriveesInterneMillionsTouristes2011 ;
        double  arriveesInterneMillionsTouristes2012 ;
        double  arriveesInterneMillionsTouristes2013 ;
        double  arriveesInterneMillionsTouristes2014 ;
        double  arriveesInterneMillionsTouristes2015 ;
        double  arriveesInterneMillionsTouristes2016 ;
        double  arriveesInterneMillionsTouristes2017 ;
        double  arriveesInterneMillionsTouristes2018 ;
        double  arriveesInterneMillionsTouristes2019 ;
        double  arriveesInterneMillionsTouristes2020 ;
        double  arriveesInterneMillionsTouristes2021 ;
        double  arriveesInterneMillionsTouristes2022 ;
        double  arriveesInterneMillionsTouristes2023 ;
        double  arriveesInterneMillionsTouristes2024 ;
        double  arriveesInterneMillionsTouristes2025 ;
        double  arriveesInterneMillionsTouristes2026 ;
        double  arriveesInterneMillionsTouristes2027 ;
        double  arriveesInterneMillionsTouristes2028 ;
        double  arriveesInterneMillionsTouristes2029 ;
        double  arriveesInterneMillionsTouristes2030 ;
    
        double   arriveesTESAerienMillionsTouristes2011 ;
        double   arriveesTESAerienMillionsTouristes2012 ;
        double   arriveesTESAerienMillionsTouristes2013 ;
        double   arriveesTESAerienMillionsTouristes2014 ;
        double   arriveesTESAerienMillionsTouristes2015 ;
        double   arriveesTESAerienMillionsTouristes2016 ;
        double   arriveesTESAerienMillionsTouristes2017 ;
        double   arriveesTESAerienMillionsTouristes2018 ;
        double   arriveesTESAerienMillionsTouristes2019 ;
        double   arriveesTESAerienMillionsTouristes2020 ;
        double   arriveesTESAerienMillionsTouristes2021 ;
        double   arriveesTESAerienMillionsTouristes2022 ;
        double   arriveesTESAerienMillionsTouristes2023 ;
        double   arriveesTESAerienMillionsTouristes2024 ;
        double   arriveesTESAerienMillionsTouristes2025 ;
        double   arriveesTESAerienMillionsTouristes2026 ;
        double   arriveesTESAerienMillionsTouristes2027 ;
        double   arriveesTESAerienMillionsTouristes2028 ;
        double   arriveesTESAerienMillionsTouristes2029 ;
        double   arriveesTESAerienMillionsTouristes2030 ;
        
        double    arriveesInterneAerienMillionsTouristes2011 ;
        double    arriveesInterneAerienMillionsTouristes2012 ;
        double    arriveesInterneAerienMillionsTouristes2013 ;
        double    arriveesInterneAerienMillionsTouristes2014 ;
        double    arriveesInterneAerienMillionsTouristes2015 ;
        double    arriveesInterneAerienMillionsTouristes2016 ;
        double    arriveesInterneAerienMillionsTouristes2017 ;
        double    arriveesInterneAerienMillionsTouristes2018 ;
        double    arriveesInterneAerienMillionsTouristes2019 ;
        double    arriveesInterneAerienMillionsTouristes2020 ;
        double    arriveesInterneAerienMillionsTouristes2021 ;
        double    arriveesInterneAerienMillionsTouristes2022 ;
        double    arriveesInterneAerienMillionsTouristes2023 ;
        double    arriveesInterneAerienMillionsTouristes2024 ;
        double    arriveesInterneAerienMillionsTouristes2025 ;
        double    arriveesInterneAerienMillionsTouristes2026 ;
        double    arriveesInterneAerienMillionsTouristes2027 ;
        double    arriveesInterneAerienMillionsTouristes2028 ;
        double    arriveesInterneAerienMillionsTouristes2029 ;
        double    arriveesInterneAerienMillionsTouristes2030 ;
    
        double     chargesPersonnelMDH2011 ;
        double     chargesPersonnelMDH2012 ;
        double     chargesPersonnelMDH2013 ;
        double     chargesPersonnelMDH2014 ;
        double     chargesPersonnelMDH2015 ;
        double     chargesPersonnelMDH2016 ;
        double     chargesPersonnelMDH2017 ;
        double     chargesPersonnelMDH2018 ;
        double     chargesPersonnelMDH2019 ;
        double     chargesPersonnelMDH2020 ;
        double     chargesPersonnelMDH2021 ;
        double     chargesPersonnelMDH2022 ;
        double     chargesPersonnelMDH2023 ;
        double     chargesPersonnelMDH2024 ;
        double     chargesPersonnelMDH2025 ;
        double     chargesPersonnelMDH2026 ;
        double     chargesPersonnelMDH2027 ;
        double     chargesPersonnelMDH2028 ;
        double     chargesPersonnelMDH2029 ;
        double     chargesPersonnelMDH2030 ;
    
        double      autresChargesExploitationMDH2011 ;
        double      autresChargesExploitationMDH2012 ;
        double      autresChargesExploitationMDH2013 ;
        double      autresChargesExploitationMDH2014 ;
        double      autresChargesExploitationMDH2015 ;
        double      autresChargesExploitationMDH2016 ;
        double      autresChargesExploitationMDH2017 ;
        double      autresChargesExploitationMDH2018 ;
        double      autresChargesExploitationMDH2019 ;
        double      autresChargesExploitationMDH2020 ;
        double      autresChargesExploitationMDH2021 ;
        double      autresChargesExploitationMDH2022 ;
        double      autresChargesExploitationMDH2023 ;
        double      autresChargesExploitationMDH2024 ;
        double      autresChargesExploitationMDH2025 ;
        double      autresChargesExploitationMDH2026 ;
        double      autresChargesExploitationMDH2027 ;
        double      autresChargesExploitationMDH2028 ;
        double      autresChargesExploitationMDH2029 ;
        double      autresChargesExploitationMDH2030 ;
    
        double       recettesMDH2011 ;
        double       recettesMDH2012 ;
        double       recettesMDH2013 ;
        double       recettesMDH2014 ;
        double       recettesMDH2015 ;
        double       recettesMDH2016 ;
        double       recettesMDH2017 ;
        double       recettesMDH2018 ;
        double       recettesMDH2019 ;
        double       recettesMDH2020 ;
        double       recettesMDH2021 ;
        double       recettesMDH2022 ;
        double       recettesMDH2023 ;
        double       recettesMDH2024 ;
        double       recettesMDH2025 ;
        double       recettesMDH2026 ;
        double       recettesMDH2027 ;
        double       recettesMDH2028 ;
        double       recettesMDH2029 ;
        double       recettesMDH2030 ;
    
        double        recettesEndevisesMDH2011 ;
        double        recettesEndevisesMDH2012 ;
        double        recettesEndevisesMDH2013 ;
        double        recettesEndevisesMDH2014 ;
        double        recettesEndevisesMDH2015 ;
        double        recettesEndevisesMDH2016 ;
        double        recettesEndevisesMDH2017 ;
        double        recettesEndevisesMDH2018 ;
        double        recettesEndevisesMDH2019 ;
        double        recettesEndevisesMDH2020 ;
        double        recettesEndevisesMDH2021 ;
        double        recettesEndevisesMDH2022 ;
        double        recettesEndevisesMDH2023 ;
        double        recettesEndevisesMDH2024 ;
        double        recettesEndevisesMDH2025 ;
        double        recettesEndevisesMDH2026 ;
        double        recettesEndevisesMDH2027 ;
        double        recettesEndevisesMDH2028 ;
        double        recettesEndevisesMDH2029 ;
        double        recettesEndevisesMDH2030 ;
    
        
        double      amortissementMDH2011 ;
        double      amortissementMDH2012 ;
        double      amortissementMDH2013 ;
        double      amortissementMDH2014 ;
        double      amortissementMDH2015 ;
        double      amortissementMDH2016 ;
        double      amortissementMDH2017 ;
        double      amortissementMDH2018 ;
        double      amortissementMDH2019 ;
        double      amortissementMDH2020 ;
        double      amortissementMDH2021 ;
        double      amortissementMDH2022 ;
        double      amortissementMDH2023 ;
        double      amortissementMDH2024 ;
        double      amortissementMDH2025 ;
        double      amortissementMDH2026 ;
        double      amortissementMDH2027 ;
        double      amortissementMDH2028 ;
        double      amortissementMDH2029 ;
        double      amortissementMDH2030 ;
    
        double      resultatAvantImpotsMDH2011 ;
        double      resultatAvantImpotsMDH2012 ;
        double      resultatAvantImpotsMDH2013 ;
        double      resultatAvantImpotsMDH2014 ;
        double      resultatAvantImpotsMDH2015 ;
        double      resultatAvantImpotsMDH2016 ;
        double      resultatAvantImpotsMDH2017 ;
        double      resultatAvantImpotsMDH2018 ;
        double      resultatAvantImpotsMDH2019 ;
        double      resultatAvantImpotsMDH2020 ;
        double      resultatAvantImpotsMDH2021 ;
        double      resultatAvantImpotsMDH2022 ;
        double      resultatAvantImpotsMDH2023 ;
        double      resultatAvantImpotsMDH2024 ;
        double      resultatAvantImpotsMDH2025 ;
        double      resultatAvantImpotsMDH2026 ;
        double      resultatAvantImpotsMDH2027 ;
        double      resultatAvantImpotsMDH2028 ;
        double      resultatAvantImpotsMDH2029 ;
        double      resultatAvantImpotsMDH2030 ;
    
        double       impotsMDH2011 ;
        double       impotsMDH2012 ;
        double       impotsMDH2013 ;
        double       impotsMDH2014 ;
        double       impotsMDH2015 ;
        double       impotsMDH2016 ;
        double       impotsMDH2017 ;
        double       impotsMDH2018 ;
        double       impotsMDH2019 ;
        double       impotsMDH2020 ;
        double       impotsMDH2021 ;
        double       impotsMDH2022 ;
        double       impotsMDH2023 ;
        double       impotsMDH2024 ;
        double       impotsMDH2025 ;
        double       impotsMDH2026 ;
        double       impotsMDH2027 ;
        double       impotsMDH2028 ;
        double       impotsMDH2029 ;
        double       impotsMDH2030 ;
    
        double        pourcentageDette;
        double        detteMDH2011 ;
        double        detteMDH2012 ;
        double        detteMDH2013 ;
        double        detteMDH2014 ;
        double        detteMDH2015 ;
        double        detteMDH2016 ;
        double        detteMDH2017 ;
        double        detteMDH2018 ;
        double        detteMDH2019 ;
        double        detteMDH2020 ;
        double        detteMDH2021 ;
        double        detteMDH2022 ;
        double        detteMDH2023 ;
        double        detteMDH2024 ;
        double        detteMDH2025 ;
        double        detteMDH2026 ;
        double        detteMDH2027 ;
        double        detteMDH2028 ;
        double        detteMDH2029 ;
        double        detteMDH2030 ;
    
        double     TVA2011 ;
        double     TVA2012 ;
        double     TVA2013 ;
        double     TVA2014 ;
        double     TVA2015 ;
        double     TVA2016 ;
        double     TVA2017 ;
        double     TVA2018 ;
        double     TVA2019 ;
        double     TVA2020 ;
        double     TVA2021 ;
        double     TVA2022 ;
        double     TVA2023 ;
        double     TVA2024 ;
        double     TVA2025 ;
        double     TVA2026 ;
        double     TVA2027 ;
        double     TVA2028 ;
        double     TVA2029 ;
        double     TVA2030 ;
        
        double      dateDebutApplicationTaxeProfessionelle;
        double      valeurLocativeTaxeProfessionelle;
        double      taxeProfessionnelle2011 ;
        double      taxeProfessionnelle2012 ;
        double      taxeProfessionnelle2013 ;
        double      taxeProfessionnelle2014 ;
        double      taxeProfessionnelle2015 ;
        double      taxeProfessionnelle2016 ;
        double      taxeProfessionnelle2017 ;
        double      taxeProfessionnelle2018 ;
        double      taxeProfessionnelle2019 ;
        double      taxeProfessionnelle2020 ;
        double      taxeProfessionnelle2021 ;
        double      taxeProfessionnelle2022 ;
        double      taxeProfessionnelle2023 ;
        double      taxeProfessionnelle2024 ;
        double      taxeProfessionnelle2025 ;
        double      taxeProfessionnelle2026 ;
        double      taxeProfessionnelle2027 ;
        double      taxeProfessionnelle2028 ;
        double      taxeProfessionnelle2029 ;
        double      taxeProfessionnelle2030 ;
    
        double       dateDebutApplicationTaxeServiceCommunaux;
        double       taxeServicesCommunaux2011 ;
        double       taxeServicesCommunaux2012 ;
        double       taxeServicesCommunaux2013 ;
        double       taxeServicesCommunaux2014 ;
        double       taxeServicesCommunaux2015 ;
        double       taxeServicesCommunaux2016 ;
        double       taxeServicesCommunaux2017 ;
        double       taxeServicesCommunaux2018 ;
        double       taxeServicesCommunaux2019 ;
        double       taxeServicesCommunaux2020 ;
        double       taxeServicesCommunaux2021 ;
        double       taxeServicesCommunaux2022 ;
        double       taxeServicesCommunaux2023 ;
        double       taxeServicesCommunaux2024 ;
        double       taxeServicesCommunaux2025 ;
        double       taxeServicesCommunaux2026 ;
        double       taxeServicesCommunaux2027 ;
        double       taxeServicesCommunaux2028 ;
        double       taxeServicesCommunaux2029 ;
        double       taxeServicesCommunaux2030 ;
    
        double       IR2011 ;
        double       IR2012 ;
        double       IR2013 ;
        double       IR2014 ;
        double       IR2015 ;
        double       IR2016 ;
        double       IR2017 ;
        double       IR2018 ;
        double       IR2019 ;
        double       IR2020 ;
        double       IR2021 ;
        double       IR2022 ;
        double       IR2023 ;
        double       IR2024 ;
        double       IR2025 ;
        double       IR2026 ;
        double       IR2027 ;
        double       IR2028 ;
        double       IR2029 ;
        double       IR2030 ;
    
        double        cashFlow2011 ;
        double        cashFlow2012 ;
        double        cashFlow2013 ;
        double        cashFlow2014 ;
        double        cashFlow2015 ;
        double        cashFlow2016 ;
        double        cashFlow2017 ;
        double        cashFlow2018 ;
        double        cashFlow2019 ;
        double        cashFlow2020 ;
        double        cashFlow2021 ;
        double        cashFlow2022 ;
        double        cashFlow2023 ;
        double        cashFlow2024 ;
        double        cashFlow2025 ;
        double        cashFlow2026 ;
        double        cashFlow2027 ;
        double        cashFlow2028 ;
        double        cashFlow2029 ;
        double        cashFlow2030 ;
        double TRI;
    //************************FIN DECLARATION VARIABLES**************************** 

        ExcelFile file_xls = new ExcelFile("Canevas1.xlsx"); 
        file_xls.chooseSheet(4);

       //********************************INSERTION****************************
        file_xls.writeCell(5, 1, 1);
        file_xls.writeCell(5, 2, "Commerces/ restauration");
        file_xls.writeCell(5, 3, "Benslimane");
        file_xls.writeCell(5, 4, 50);
        file_xls.writeCell(5, 5, 0);
        file_xls.writeCell(5, 6, 1);
        file_xls.writeCell(5, 7, 0);
        file_xls.writeCell(5, 8, 16);
        file_xls.writeCell(5, 9, 64);
        file_xls.writeCell(5, 10, 2026);
        file_xls.writeCell(5, 12, 2);
        
        //test pour que toute les entréés soient des nombres
        file_xls.writeCell(6, 1, 1,"text");
        file_xls.writeCell(6, 2, "Commerces/ restauration");
        file_xls.writeCell(6, 3, "Benslimane");
        file_xls.writeCell(6, 4, 50,"text");
        file_xls.writeCell(6, 5, 0,"text");
        file_xls.writeCell(6, 6, 1,"text");
        file_xls.writeCell(6, 7, 0,"text");
        file_xls.writeCell(6, 8, 16,"text");
        file_xls.writeCell(6, 9, 64,"text");
        file_xls.writeCell(6, 10, 2026,"text");
        file_xls.writeCell(6, 12, 2,"text");
        

        // Quote part TES
        file_xls.writeCell(5, 204, 0.3,"0%");
        //test
        file_xls.writeCell(6, 204, "30%","text");
        
        // TO & DMS 					
        file_xls.writeCell(5, 209, 0.5,"0%");
        file_xls.writeCell(5, 210, 2);
        file_xls.writeCell(5, 211, 1.2);
        
        //test
        file_xls.writeCell(6, 209, "50%","text");
        file_xls.writeCell(6, 210, 2,"text");
        file_xls.writeCell(6, 211, 1.2,"text");

        // Flux aéroports 
        file_xls.writeCell(5, 297, 1,"0%");
        //test
        file_xls.writeCell(6, 297, "100%","text");

        // Arrivées TES aérien (millions de touristes) 																			
        
        file_xls.writeCell(5, 318,0,"0%");//0% arrivées doubleernes par aérien
        file_xls.writeCell(6, 318,"0%","text");//0% arrivées doubleernes par aérien

        // Arrivées doubleerne aérien (millions de touristes) 	
        file_xls.writeCell(5, 339,"Mohammed V"); //Aéroport utilisé
        file_xls.writeCell(6, 339,"Mohammed V"); //Aéroport utilisé
        
        // Charges exploitation					
        file_xls.writeCell(5, 341, 60000);// Salaire moyen par employé - DH/an
        file_xls.writeCell(6, 341, 60000,"text");// Salaire moyen par employé - DH/an

        file_xls.writeCell(5, 342, 0.6,"0%");
        file_xls.writeCell(5, 343, 0.9,"0%");
        file_xls.writeCell(5, 344, 1.2,"0%");
        file_xls.writeCell(5, 345, 1.24,"0%");
        file_xls.writeCell(5, 346, 0.02,"0%");

        file_xls.writeCell(6, 342, 0.6,"text");
        file_xls.writeCell(6, 343, 0.9,"text");
        file_xls.writeCell(6, 344, 1.2,"text");
        file_xls.writeCell(6, 345, 1.24,"text");
        file_xls.writeCell(6, 346, 0.02,"text");

        //  Marge brute (EBITDA/CA) 
        file_xls.writeCell(5, 390, 0.3,"0%");
        file_xls.writeCell(5, 391, 0.42,"0%");
        file_xls.writeCell(5, 392, 0.53,"0%");
        file_xls.writeCell(5, 393, 0.55,"0%");
        file_xls.writeCell(5, 394, 0.02,"0%");

        //test
        file_xls.writeCell(6, 390, 0.3,"text");
        file_xls.writeCell(6, 391, 0.42,"text");
        file_xls.writeCell(6, 392, 0.53,"text");
        file_xls.writeCell(6, 393, 0.55,"text");
        file_xls.writeCell(6, 394, 0.02,"text");

        //  0% TES 
        file_xls.writeCell(5, 417, 0.3,"0%");
        file_xls.writeCell(6, 417, 0.3,"text");


        // Amortissement (ans)
        file_xls.writeCell(5, 460, 12);

        file_xls.writeCell(5, 547, 0.2,"0%");//Taux TVA

        file_xls.writeCell(5, 569, 0.3,"0%");// Taux de la Taxe professionnelle
        
        file_xls.writeCell(5, 593, 0.11,"0%");// Taux de la taxe de services communaux
       //********************************END_INSERTION****************************


       //*****************************LECTURE DES RESULTATS***********************
       anneeDebutPrevisionnelle = (double)file_xls.readCell(5, 11);
       totalEmlpois = (double) file_xls.readCell(5, 13);

    //    Nombre d'emplois Totales crées 																			
       nombreeEmploisTotalesCrees2011 = (double)file_xls.readCell(5,15 );
       nombreeEmploisTotalesCrees2012 = (double)file_xls.readCell(5,16 );
       nombreeEmploisTotalesCrees2013 = (double)file_xls.readCell(5,17 );
       nombreeEmploisTotalesCrees2014 = (double)file_xls.readCell(5,18 );
       nombreeEmploisTotalesCrees2015 = (double)file_xls.readCell(5,19 );
       nombreeEmploisTotalesCrees2016 = (double)file_xls.readCell(5,20 );
       nombreeEmploisTotalesCrees2017 = (double)file_xls.readCell(5,21 );
       nombreeEmploisTotalesCrees2018 = (double)file_xls.readCell(5,22 );
       nombreeEmploisTotalesCrees2019 = (double)file_xls.readCell(5,23 );
       nombreeEmploisTotalesCrees2020 = (double)file_xls.readCell(5,24 );
       nombreeEmploisTotalesCrees2021 = (double)file_xls.readCell(5,25 );
       nombreeEmploisTotalesCrees2022 = (double)file_xls.readCell(5,26 );
       nombreeEmploisTotalesCrees2023 = (double)file_xls.readCell(5,27 );
       nombreeEmploisTotalesCrees2024 = (double)file_xls.readCell(5,28 );
       nombreeEmploisTotalesCrees2025 = (double)file_xls.readCell(5,29 );
       nombreeEmploisTotalesCrees2026 = (double)file_xls.readCell(5,30 );
       nombreeEmploisTotalesCrees2027 = (double)file_xls.readCell(5,31 );
       nombreeEmploisTotalesCrees2028 = (double)file_xls.readCell(5,32 );
       nombreeEmploisTotalesCrees2029 = (double)file_xls.readCell(5,33 );
       nombreeEmploisTotalesCrees2030 = (double)file_xls.readCell(5,34 );

    //    Nombre d'emplois directs crées 		
        nombreEmploisDirectsCrees2011 = (double)file_xls.readCell(5,36 );
        nombreEmploisDirectsCrees2012 = (double)file_xls.readCell(5,37 );
        nombreEmploisDirectsCrees2013 = (double)file_xls.readCell(5,38 );
        nombreEmploisDirectsCrees2014 = (double)file_xls.readCell(5,39 );
        nombreEmploisDirectsCrees2015 = (double)file_xls.readCell(5,40 );
        nombreEmploisDirectsCrees2016 = (double)file_xls.readCell(5,41 );
        nombreEmploisDirectsCrees2017 = (double)file_xls.readCell(5,42 );
        nombreEmploisDirectsCrees2018 = (double)file_xls.readCell(5,43 );
        nombreEmploisDirectsCrees2019 = (double)file_xls.readCell(5,44 );
        nombreEmploisDirectsCrees2020 = (double)file_xls.readCell(5,45 );
        nombreEmploisDirectsCrees2021 = (double)file_xls.readCell(5,46 );
        nombreEmploisDirectsCrees2022 = (double)file_xls.readCell(5,47 );
        nombreEmploisDirectsCrees2023 = (double)file_xls.readCell(5,48 );
        nombreEmploisDirectsCrees2024 = (double)file_xls.readCell(5,49 );
        nombreEmploisDirectsCrees2025 = (double)file_xls.readCell(5,50 );
        nombreEmploisDirectsCrees2026 = (double)file_xls.readCell(5,51 );
        nombreEmploisDirectsCrees2027 = (double)file_xls.readCell(5,52 );
        nombreEmploisDirectsCrees2028 = (double)file_xls.readCell(5,53 );
        nombreEmploisDirectsCrees2029 = (double)file_xls.readCell(5,54 );
        nombreEmploisDirectsCrees2030 = (double)file_xls.readCell(5,55 );

        // Nombre d'emplois indirects crées 									
        nombreEmploisIndirectsCrees2011 = (double)file_xls.readCell(5,57 );
        nombreEmploisIndirectsCrees2012 = (double)file_xls.readCell(5,58 );
        nombreEmploisIndirectsCrees2013 = (double)file_xls.readCell(5,59 );
        nombreEmploisIndirectsCrees2014 = (double)file_xls.readCell(5,60 );
        nombreEmploisIndirectsCrees2015 = (double)file_xls.readCell(5,61 );
        nombreEmploisIndirectsCrees2016 = (double)file_xls.readCell(5,62 );
        nombreEmploisIndirectsCrees2017 = (double)file_xls.readCell(5,63 );
        nombreEmploisIndirectsCrees2018 = (double)file_xls.readCell(5,64 );
        nombreEmploisIndirectsCrees2019 = (double)file_xls.readCell(5,65 );
        nombreEmploisIndirectsCrees2020 = (double)file_xls.readCell(5,66 );
        nombreEmploisIndirectsCrees2021 = (double)file_xls.readCell(5,67 );
        nombreEmploisIndirectsCrees2022 = (double)file_xls.readCell(5,68 );
        nombreEmploisIndirectsCrees2023 = (double)file_xls.readCell(5,69 );
        nombreEmploisIndirectsCrees2024 = (double)file_xls.readCell(5,70 );
        nombreEmploisIndirectsCrees2025 = (double)file_xls.readCell(5,71 );
        nombreEmploisIndirectsCrees2026 = (double)file_xls.readCell(5,72 );
        nombreEmploisIndirectsCrees2027 = (double)file_xls.readCell(5,73 );
        nombreEmploisIndirectsCrees2028 = (double)file_xls.readCell(5,74 );
        nombreEmploisIndirectsCrees2029 = (double)file_xls.readCell(5,75 );
        nombreEmploisIndirectsCrees2030 = (double)file_xls.readCell(5,76 );		

        //    Séquençage investissements en % 														
        pourcentageSequençageInvestissements2011 = (Double)file_xls.readCell(5,78 );
        pourcentageSequençageInvestissements2012 = (double)file_xls.readCell(5,79 );
        pourcentageSequençageInvestissements2013 = (double)file_xls.readCell(5,80 );
        pourcentageSequençageInvestissements2014 = (double)file_xls.readCell(5,81 );
        pourcentageSequençageInvestissements2015 = (double)file_xls.readCell(5,82 );
        pourcentageSequençageInvestissements2016 = (double)file_xls.readCell(5,83 );
        pourcentageSequençageInvestissements2017 = (double)file_xls.readCell(5,84 );
        pourcentageSequençageInvestissements2018 = (double)file_xls.readCell(5,85 );
        pourcentageSequençageInvestissements2019 = (double)file_xls.readCell(5,86 );
        pourcentageSequençageInvestissements2020 = (double)file_xls.readCell(5,87 );
        pourcentageSequençageInvestissements2021 = (double)file_xls.readCell(5,88 );
        pourcentageSequençageInvestissements2022 = (double)file_xls.readCell(5,89 );
        pourcentageSequençageInvestissements2023 = (double)file_xls.readCell(5,90 );
        pourcentageSequençageInvestissements2024 = (double)file_xls.readCell(5,91 );
        pourcentageSequençageInvestissements2025 = (double)file_xls.readCell(5,92 );
        pourcentageSequençageInvestissements2026 = (double)file_xls.readCell(5,93 );
        pourcentageSequençageInvestissements2027 = (double)file_xls.readCell(5,94 );
        pourcentageSequençageInvestissements2028 = (double)file_xls.readCell(5,95 );
        pourcentageSequençageInvestissements2029 = (double)file_xls.readCell(5,96 );
        pourcentageSequençageInvestissements2030 = (double)file_xls.readCell(5,97 );

        // Investissement tourisque engagé  														
        investissementTourisqueEngage2011 = (double)file_xls.readCell(5,99 );
        investissementTourisqueEngage2012 = (double)file_xls.readCell(5,100 );
        investissementTourisqueEngage2013 = (double)file_xls.readCell(5,101 );
        investissementTourisqueEngage2014 = (double)file_xls.readCell(5,102 );
        investissementTourisqueEngage2015 = (double)file_xls.readCell(5,103 );
        investissementTourisqueEngage2016 = (double)file_xls.readCell(5,104 );
        investissementTourisqueEngage2017 = (double)file_xls.readCell(5,105 );
        investissementTourisqueEngage2018 = (double)file_xls.readCell(5,106 );
        investissementTourisqueEngage2019 = (double)file_xls.readCell(5,107 );
        investissementTourisqueEngage2020 = (double)file_xls.readCell(5,108 );
        investissementTourisqueEngage2021 = (double)file_xls.readCell(5,109 );
        investissementTourisqueEngage2022 = (double)file_xls.readCell(5,110 );
        investissementTourisqueEngage2023 = (double)file_xls.readCell(5,111 );
        investissementTourisqueEngage2024 = (double)file_xls.readCell(5,112 );
        investissementTourisqueEngage2025 = (double)file_xls.readCell(5,113 );
        investissementTourisqueEngage2026 = (double)file_xls.readCell(5,114 );
        investissementTourisqueEngage2027 = (double)file_xls.readCell(5,115 );
        investissementTourisqueEngage2028 = (double)file_xls.readCell(5,116 );
        investissementTourisqueEngage2029 = (double)file_xls.readCell(5,117 );
        investissementTourisqueEngage2030 = (double)file_xls.readCell(5,118 );

        // séquençage de l'investissement tourisque  					
        sequençageInvestissementTourisque2011 = (double)file_xls.readCell(5,120 );
        sequençageInvestissementTourisque2012 = (double)file_xls.readCell(5,121 );
        sequençageInvestissementTourisque2013 = (double)file_xls.readCell(5,122 );
        sequençageInvestissementTourisque2014 = (double)file_xls.readCell(5,123 );
        sequençageInvestissementTourisque2015 = (double)file_xls.readCell(5,124 );
        sequençageInvestissementTourisque2016 = (double)file_xls.readCell(5,125 );
        sequençageInvestissementTourisque2017 = (double)file_xls.readCell(5,126 );
        sequençageInvestissementTourisque2018 = (double)file_xls.readCell(5,127 );
        sequençageInvestissementTourisque2019 = (double)file_xls.readCell(5,128 );
        sequençageInvestissementTourisque2020 = (double)file_xls.readCell(5,129 );
        sequençageInvestissementTourisque2021 = (double)file_xls.readCell(5,130 );
        sequençageInvestissementTourisque2022 = (double)file_xls.readCell(5,131 );
        sequençageInvestissementTourisque2023 = (double)file_xls.readCell(5,132 );
        sequençageInvestissementTourisque2024 = (double)file_xls.readCell(5,133 );
        sequençageInvestissementTourisque2025 = (double)file_xls.readCell(5,134 );
        sequençageInvestissementTourisque2026 = (double)file_xls.readCell(5,135 );
        sequençageInvestissementTourisque2027 = (double)file_xls.readCell(5,136 );
        sequençageInvestissementTourisque2028 = (double)file_xls.readCell(5,137 );
        sequençageInvestissementTourisque2029 = (double)file_xls.readCell(5,138 );
        sequençageInvestissementTourisque2030 = (double)file_xls.readCell(5,139 );	
        
        // séquençage de la capacité   																
        sequençageCapacite2011 = (double)file_xls.readCell(5,141 );
        sequençageCapacite2012 = (double)file_xls.readCell(5,142 );
        sequençageCapacite2013 = (double)file_xls.readCell(5,143 );
        sequençageCapacite2014 = (double)file_xls.readCell(5,144 );
        sequençageCapacite2015 = (double)file_xls.readCell(5,145 );
        sequençageCapacite2016 = (double)file_xls.readCell(5,146 );
        sequençageCapacite2017 = (double)file_xls.readCell(5,147 );
        sequençageCapacite2018 = (double)file_xls.readCell(5,148 );
        sequençageCapacite2019 = (double)file_xls.readCell(5,149 );
        sequençageCapacite2020 = (double)file_xls.readCell(5,150 );
        sequençageCapacite2021 = (double)file_xls.readCell(5,151 );
        sequençageCapacite2022 = (double)file_xls.readCell(5,152 );
        sequençageCapacite2023 = (double)file_xls.readCell(5,153 );
        sequençageCapacite2024 = (double)file_xls.readCell(5,154 );
        sequençageCapacite2025 = (double)file_xls.readCell(5,155 );
        sequençageCapacite2026 = (double)file_xls.readCell(5,156 );
        sequençageCapacite2027 = (double)file_xls.readCell(5,157 );
        sequençageCapacite2028 = (double)file_xls.readCell(5,158 );
        sequençageCapacite2029 = (double)file_xls.readCell(5,159 );
        sequençageCapacite2030 = (double)file_xls.readCell(5,160 );

        //  Investissement Public engagement ( Mdh)  																			
        InvestissementPublicEngagementEnMdh2011 = (double)file_xls.readCell(5,162 );
        InvestissementPublicEngagementEnMdh2012 = (double)file_xls.readCell(5,163 );
        InvestissementPublicEngagementEnMdh2013 = (double)file_xls.readCell(5,164 );
        InvestissementPublicEngagementEnMdh2014 = (double)file_xls.readCell(5,165 );
        InvestissementPublicEngagementEnMdh2015 = (double)file_xls.readCell(5,166 );
        InvestissementPublicEngagementEnMdh2016 = (double)file_xls.readCell(5,167 );
        InvestissementPublicEngagementEnMdh2017 = (double)file_xls.readCell(5,168 );
        InvestissementPublicEngagementEnMdh2018 = (double)file_xls.readCell(5,169 );
        InvestissementPublicEngagementEnMdh2019 = (double)file_xls.readCell(5,170 );
        InvestissementPublicEngagementEnMdh2020 = (double)file_xls.readCell(5,171 );
        InvestissementPublicEngagementEnMdh2021 = (double)file_xls.readCell(5,172 );
        InvestissementPublicEngagementEnMdh2022 = (double)file_xls.readCell(5,173 );
        InvestissementPublicEngagementEnMdh2023 = (double)file_xls.readCell(5,174 );
        InvestissementPublicEngagementEnMdh2024 = (double)file_xls.readCell(5,175 );
        InvestissementPublicEngagementEnMdh2025 = (double)file_xls.readCell(5,176 );
        InvestissementPublicEngagementEnMdh2026 = (double)file_xls.readCell(5,177 );
        InvestissementPublicEngagementEnMdh2027 = (double)file_xls.readCell(5,178 );
        InvestissementPublicEngagementEnMdh2028 = (double)file_xls.readCell(5,179 );
        InvestissementPublicEngagementEnMdh2029 = (double)file_xls.readCell(5,180 );
        InvestissementPublicEngagementEnMdh2030 = (double)file_xls.readCell(5,181 );

        // Investissement privé engagement ( en MDH)  
        InvestissementPrivéEngagementEnMdh2011 = (double)file_xls.readCell(5,183 );
        InvestissementPrivéEngagementEnMdh2012 = (double)file_xls.readCell(5,184 );
        InvestissementPrivéEngagementEnMdh2013 = (double)file_xls.readCell(5,185 );
        InvestissementPrivéEngagementEnMdh2014 = (double)file_xls.readCell(5,186 );
        InvestissementPrivéEngagementEnMdh2015 = (double)file_xls.readCell(5,187 );
        InvestissementPrivéEngagementEnMdh2016 = (double)file_xls.readCell(5,188 );
        InvestissementPrivéEngagementEnMdh2017 = (double)file_xls.readCell(5,189 );
        InvestissementPrivéEngagementEnMdh2018 = (double)file_xls.readCell(5,190 );
        InvestissementPrivéEngagementEnMdh2019 = (double)file_xls.readCell(5,191 );
        InvestissementPrivéEngagementEnMdh2020 = (double)file_xls.readCell(5,192 );
        InvestissementPrivéEngagementEnMdh2021 = (double)file_xls.readCell(5,193 );
        InvestissementPrivéEngagementEnMdh2022 = (double)file_xls.readCell(5,194 );
        InvestissementPrivéEngagementEnMdh2023 = (double)file_xls.readCell(5,195 );
        InvestissementPrivéEngagementEnMdh2024 = (double)file_xls.readCell(5,196 );
        InvestissementPrivéEngagementEnMdh2025 = (double)file_xls.readCell(5,197 );
        InvestissementPrivéEngagementEnMdh2026 = (double)file_xls.readCell(5,198 );
        InvestissementPrivéEngagementEnMdh2027 = (double)file_xls.readCell(5,199 );
        InvestissementPrivéEngagementEnMdh2028 = (double)file_xls.readCell(5,200 );
        InvestissementPrivéEngagementEnMdh2029 = (double)file_xls.readCell(5,201 );
        InvestissementPrivéEngagementEnMdh2030 = (double)file_xls.readCell(5,202 );

        // TO & DMS
        TO_A1 = (double)file_xls.readCell(5,206 );
        TO_A2 = (double)file_xls.readCell(5,207 );
        TO_A3 = (double)file_xls.readCell(5,208 );
        
        // Nuitées (millions de nuitées) 	
        nuitees_millionsdenuitees2011 = (double)file_xls.readCell(5,213 );
        nuitees_millionsdenuitees2012 = (double)file_xls.readCell(5,214 );
        nuitees_millionsdenuitees2013 = (double)file_xls.readCell(5,215 );
        nuitees_millionsdenuitees2014 = (double)file_xls.readCell(5,216 );
        nuitees_millionsdenuitees2015 = (double)file_xls.readCell(5,217 );
        nuitees_millionsdenuitees2016 = (double)file_xls.readCell(5,218 );
        nuitees_millionsdenuitees2017 = (double)file_xls.readCell(5,219 );
        nuitees_millionsdenuitees2018 = (double)file_xls.readCell(5,220 );
        nuitees_millionsdenuitees2019 = (double)file_xls.readCell(5,221 );
        nuitees_millionsdenuitees2020 = (double)file_xls.readCell(5,222 );
        nuitees_millionsdenuitees2021 = (double)file_xls.readCell(5,223 );
        nuitees_millionsdenuitees2022 = (double)file_xls.readCell(5,224 );
        nuitees_millionsdenuitees2023 = (double)file_xls.readCell(5,225 );
        nuitees_millionsdenuitees2024 = (double)file_xls.readCell(5,226 );
        nuitees_millionsdenuitees2025 = (double)file_xls.readCell(5,227 );
        nuitees_millionsdenuitees2026 = (double)file_xls.readCell(5,228 );
        nuitees_millionsdenuitees2027 = (double)file_xls.readCell(5,229 );
        nuitees_millionsdenuitees2028 = (double)file_xls.readCell(5,230 );
        nuitees_millionsdenuitees2029 = (double)file_xls.readCell(5,231 );
        nuitees_millionsdenuitees2030 = (double)file_xls.readCell(5,232 );	
        
        // Arrivées (millions de touristes) 														
        arriveesMillionsTouristes2011 = (double)file_xls.readCell(5,234 );
        arriveesMillionsTouristes2012 = (double)file_xls.readCell(5,235 );
        arriveesMillionsTouristes2013 = (double)file_xls.readCell(5,236 );
        arriveesMillionsTouristes2014 = (double)file_xls.readCell(5,237 );
        arriveesMillionsTouristes2015 = (double)file_xls.readCell(5,238 );
        arriveesMillionsTouristes2016 = (double)file_xls.readCell(5,239 );
        arriveesMillionsTouristes2017 = (double)file_xls.readCell(5,240 );
        arriveesMillionsTouristes2018 = (double)file_xls.readCell(5,241 );
        arriveesMillionsTouristes2019 = (double)file_xls.readCell(5,242 );
        arriveesMillionsTouristes2020 = (double)file_xls.readCell(5,243 );
        arriveesMillionsTouristes2021 = (double)file_xls.readCell(5,244 );
        arriveesMillionsTouristes2022 = (double)file_xls.readCell(5,245 );
        arriveesMillionsTouristes2023 = (double)file_xls.readCell(5,246 );
        arriveesMillionsTouristes2024 = (double)file_xls.readCell(5,247 );
        arriveesMillionsTouristes2025 = (double)file_xls.readCell(5,248 );
        arriveesMillionsTouristes2026 = (double)file_xls.readCell(5,249 );
        arriveesMillionsTouristes2027 = (double)file_xls.readCell(5,250 );
        arriveesMillionsTouristes2028 = (double)file_xls.readCell(5,251 );
        arriveesMillionsTouristes2029 = (double)file_xls.readCell(5,252 );
        arriveesMillionsTouristes2030 = (double)file_xls.readCell(5,253 );
            
        // Arrivées TES (millions de touristes) 
        arriveesTESMillionsTouristes2011 = (double)file_xls.readCell(5,255 );
        arriveesTESMillionsTouristes2012 = (double)file_xls.readCell(5,256 );
        arriveesTESMillionsTouristes2013 = (double)file_xls.readCell(5,257 );
        arriveesTESMillionsTouristes2014 = (double)file_xls.readCell(5,258 );
        arriveesTESMillionsTouristes2015 = (double)file_xls.readCell(5,259 );
        arriveesTESMillionsTouristes2016 = (double)file_xls.readCell(5,260 );
        arriveesTESMillionsTouristes2017 = (double)file_xls.readCell(5,261 );
        arriveesTESMillionsTouristes2018 = (double)file_xls.readCell(5,262 );
        arriveesTESMillionsTouristes2019 = (double)file_xls.readCell(5,263 );
        arriveesTESMillionsTouristes2020 = (double)file_xls.readCell(5,264 );
        arriveesTESMillionsTouristes2021 = (double)file_xls.readCell(5,265 );
        arriveesTESMillionsTouristes2022 = (double)file_xls.readCell(5,266 );
        arriveesTESMillionsTouristes2023 = (double)file_xls.readCell(5,267 );
        arriveesTESMillionsTouristes2024 = (double)file_xls.readCell(5,268 );
        arriveesTESMillionsTouristes2025 = (double)file_xls.readCell(5,269 );
        arriveesTESMillionsTouristes2026 = (double)file_xls.readCell(5,270 );
        arriveesTESMillionsTouristes2027 = (double)file_xls.readCell(5,271 );
        arriveesTESMillionsTouristes2028 = (double)file_xls.readCell(5,272 );
        arriveesTESMillionsTouristes2029 = (double)file_xls.readCell(5,273 );
        arriveesTESMillionsTouristes2030 = (double)file_xls.readCell(5,274 );
        
        // Arrivées Interne (millions de touristes) 														
        arriveesInterneMillionsTouristes2011 = (double)file_xls.readCell(5,276 );
        arriveesInterneMillionsTouristes2012 = (double)file_xls.readCell(5,277 );
        arriveesInterneMillionsTouristes2013 = (double)file_xls.readCell(5,278 );
        arriveesInterneMillionsTouristes2014 = (double)file_xls.readCell(5,279 );
        arriveesInterneMillionsTouristes2015 = (double)file_xls.readCell(5,280 );
        arriveesInterneMillionsTouristes2016 = (double)file_xls.readCell(5,281 );
        arriveesInterneMillionsTouristes2017 = (double)file_xls.readCell(5,282 );
        arriveesInterneMillionsTouristes2018 = (double)file_xls.readCell(5,283 );
        arriveesInterneMillionsTouristes2019 = (double)file_xls.readCell(5,284 );
        arriveesInterneMillionsTouristes2020 = (double)file_xls.readCell(5,285 );
        arriveesInterneMillionsTouristes2021 = (double)file_xls.readCell(5,286 );
        arriveesInterneMillionsTouristes2022 = (double)file_xls.readCell(5,287 );
        arriveesInterneMillionsTouristes2023 = (double)file_xls.readCell(5,288 );
        arriveesInterneMillionsTouristes2024 = (double)file_xls.readCell(5,289 );
        arriveesInterneMillionsTouristes2025 = (double)file_xls.readCell(5,290 );
        arriveesInterneMillionsTouristes2026 = (double)file_xls.readCell(5,291 );
        arriveesInterneMillionsTouristes2027 = (double)file_xls.readCell(5,292 );
        arriveesInterneMillionsTouristes2028 = (double)file_xls.readCell(5,293 );
        arriveesInterneMillionsTouristes2029 = (double)file_xls.readCell(5,294 );
        arriveesInterneMillionsTouristes2030 = (double)file_xls.readCell(5,295 );

        // Arrivées TES aérien (millions de touristes) 																			
        arriveesTESAerienMillionsTouristes2011 = (double)file_xls.readCell(5,298 );
        arriveesTESAerienMillionsTouristes2012 = (double)file_xls.readCell(5,299 );
        arriveesTESAerienMillionsTouristes2013 = (double)file_xls.readCell(5,300 );
        arriveesTESAerienMillionsTouristes2014 = (double)file_xls.readCell(5,301 );
        arriveesTESAerienMillionsTouristes2015 = (double)file_xls.readCell(5,302 );
        arriveesTESAerienMillionsTouristes2016 = (double)file_xls.readCell(5,303 );
        arriveesTESAerienMillionsTouristes2017 = (double)file_xls.readCell(5,304 );
        arriveesTESAerienMillionsTouristes2018 = (double)file_xls.readCell(5,305 );
        arriveesTESAerienMillionsTouristes2019 = (double)file_xls.readCell(5,306 );
        arriveesTESAerienMillionsTouristes2020 = (double)file_xls.readCell(5,307 );
        arriveesTESAerienMillionsTouristes2021 = (double)file_xls.readCell(5,308 );
        arriveesTESAerienMillionsTouristes2022 = (double)file_xls.readCell(5,309 );
        arriveesTESAerienMillionsTouristes2023 = (double)file_xls.readCell(5,310 );
        arriveesTESAerienMillionsTouristes2024 = (double)file_xls.readCell(5,311 );
        arriveesTESAerienMillionsTouristes2025 = (double)file_xls.readCell(5,312 );
        arriveesTESAerienMillionsTouristes2026 = (double)file_xls.readCell(5,313 );
        arriveesTESAerienMillionsTouristes2027 = (double)file_xls.readCell(5,314 );
        arriveesTESAerienMillionsTouristes2028 = (double)file_xls.readCell(5,315 );
        arriveesTESAerienMillionsTouristes2029 = (double)file_xls.readCell(5,316 );
        arriveesTESAerienMillionsTouristes2030 = (double)file_xls.readCell(5,317 );

        // Arrivées Interne aérien (millions de touristes) 																			
        arriveesInterneAerienMillionsTouristes2011 = (double)file_xls.readCell(5,319 );
        arriveesInterneAerienMillionsTouristes2012 = (double)file_xls.readCell(5,320 );
        arriveesInterneAerienMillionsTouristes2013 = (double)file_xls.readCell(5,321 );
        arriveesInterneAerienMillionsTouristes2014 = (double)file_xls.readCell(5,322 );
        arriveesInterneAerienMillionsTouristes2015 = (double)file_xls.readCell(5,323 );
        arriveesInterneAerienMillionsTouristes2016 = (double)file_xls.readCell(5,324 );
        arriveesInterneAerienMillionsTouristes2017 = (double)file_xls.readCell(5,325 );
        arriveesInterneAerienMillionsTouristes2018 = (double)file_xls.readCell(5,326 );
        arriveesInterneAerienMillionsTouristes2019 = (double)file_xls.readCell(5,327 );
        arriveesInterneAerienMillionsTouristes2020 = (double)file_xls.readCell(5,328 );
        arriveesInterneAerienMillionsTouristes2021 = (double)file_xls.readCell(5,329 );
        arriveesInterneAerienMillionsTouristes2022 = (double)file_xls.readCell(5,330 );
        arriveesInterneAerienMillionsTouristes2023 = (double)file_xls.readCell(5,331 );
        arriveesInterneAerienMillionsTouristes2024 = (double)file_xls.readCell(5,332 );
        arriveesInterneAerienMillionsTouristes2025 = (double)file_xls.readCell(5,333 );
        arriveesInterneAerienMillionsTouristes2026 = (double)file_xls.readCell(5,334 );
        arriveesInterneAerienMillionsTouristes2027 = (double)file_xls.readCell(5,335 );
        arriveesInterneAerienMillionsTouristes2028 = (double)file_xls.readCell(5,336 );
        arriveesInterneAerienMillionsTouristes2029 = (double)file_xls.readCell(5,337 );
        arriveesInterneAerienMillionsTouristes2030 = (double)file_xls.readCell(5,338 );

        // Charges personnel (MDH) 	
        chargesPersonnelMDH2011 = (double)file_xls.readCell(5,348 );
        chargesPersonnelMDH2012 = (double)file_xls.readCell(5,349 );
        chargesPersonnelMDH2013 = (double)file_xls.readCell(5,350 );
        chargesPersonnelMDH2014 = (double)file_xls.readCell(5,351 );
        chargesPersonnelMDH2015 = (double)file_xls.readCell(5,352 );
        chargesPersonnelMDH2016 = (double)file_xls.readCell(5,353 );
        chargesPersonnelMDH2017 = (double)file_xls.readCell(5,354 );
        chargesPersonnelMDH2018 = (double)file_xls.readCell(5,355 );
        chargesPersonnelMDH2019 = (double)file_xls.readCell(5,356 );
        chargesPersonnelMDH2020 = (double)file_xls.readCell(5,357 );
        chargesPersonnelMDH2021 = (double)file_xls.readCell(5,358 );
        chargesPersonnelMDH2022 = (double)file_xls.readCell(5,359 );
        chargesPersonnelMDH2023 = (double)file_xls.readCell(5,360 );
        chargesPersonnelMDH2024 = (double)file_xls.readCell(5,361 );
        chargesPersonnelMDH2025 = (double)file_xls.readCell(5,362 );
        chargesPersonnelMDH2026 = (double)file_xls.readCell(5,363 );
        chargesPersonnelMDH2027 = (double)file_xls.readCell(5,364 );
        chargesPersonnelMDH2028 = (double)file_xls.readCell(5,365 );
        chargesPersonnelMDH2029 = (double)file_xls.readCell(5,366 );
        chargesPersonnelMDH2030 = (double)file_xls.readCell(5,367 );

        // Autres charges exploitation (MDH) 																			
        autresChargesExploitationMDH2011 = (double)file_xls.readCell(5,369 );
        autresChargesExploitationMDH2012 = (double)file_xls.readCell(5,370 );
        autresChargesExploitationMDH2013 = (double)file_xls.readCell(5,371 );
        autresChargesExploitationMDH2014 = (double)file_xls.readCell(5,372 );
        autresChargesExploitationMDH2015 = (double)file_xls.readCell(5,373 );
        autresChargesExploitationMDH2016 = (double)file_xls.readCell(5,374 );
        autresChargesExploitationMDH2017 = (double)file_xls.readCell(5,375 );
        autresChargesExploitationMDH2018 = (double)file_xls.readCell(5,376 );
        autresChargesExploitationMDH2019 = (double)file_xls.readCell(5,377 );
        autresChargesExploitationMDH2020 = (double)file_xls.readCell(5,378 );
        autresChargesExploitationMDH2021 = (double)file_xls.readCell(5,379 );
        autresChargesExploitationMDH2022 = (double)file_xls.readCell(5,380 );
        autresChargesExploitationMDH2023 = (double)file_xls.readCell(5,381 );
        autresChargesExploitationMDH2024 = (double)file_xls.readCell(5,382 );
        autresChargesExploitationMDH2025 = (double)file_xls.readCell(5,383 );
        autresChargesExploitationMDH2026 = (double)file_xls.readCell(5,384 );
        autresChargesExploitationMDH2027 = (double)file_xls.readCell(5,385 );
        autresChargesExploitationMDH2028 = (double)file_xls.readCell(5,386 );
        autresChargesExploitationMDH2029 = (double)file_xls.readCell(5,387 );
        autresChargesExploitationMDH2030 = (double)file_xls.readCell(5,388 );

        // Recettes (MDH) 	
        recettesMDH2011 = (double)file_xls.readCell(5,396 );
        recettesMDH2012 = (double)file_xls.readCell(5,397 );
        recettesMDH2013 = (double)file_xls.readCell(5,398 );
        recettesMDH2014 = (double)file_xls.readCell(5,399 );
        recettesMDH2015 = (double)file_xls.readCell(5,400 );
        recettesMDH2016 = (double)file_xls.readCell(5,401 );
        recettesMDH2017 = (double)file_xls.readCell(5,402 );
        recettesMDH2018 = (double)file_xls.readCell(5,403 );
        recettesMDH2019 = (double)file_xls.readCell(5,404 );
        recettesMDH2020 = (double)file_xls.readCell(5,405 );
        recettesMDH2021 = (double)file_xls.readCell(5,406 );
        recettesMDH2022 = (double)file_xls.readCell(5,407 );
        recettesMDH2023 = (double)file_xls.readCell(5,408 );
        recettesMDH2024 = (double)file_xls.readCell(5,409 );
        recettesMDH2025 = (double)file_xls.readCell(5,410 );
        recettesMDH2026 = (double)file_xls.readCell(5,411 );
        recettesMDH2027 = (double)file_xls.readCell(5,412 );
        recettesMDH2028 = (double)file_xls.readCell(5,413 );
        recettesMDH2029 = (double)file_xls.readCell(5,414 );
        recettesMDH2030 = (double)file_xls.readCell(5,415 );		
        
        // Recettes en devises (MDH)
        recettesEndevisesMDH2011 = (double)file_xls.readCell(5,418 );
        recettesEndevisesMDH2012 = (double)file_xls.readCell(5,419 );
        recettesEndevisesMDH2013 = (double)file_xls.readCell(5,420 );
        recettesEndevisesMDH2014 = (double)file_xls.readCell(5,421 );
        recettesEndevisesMDH2015 = (double)file_xls.readCell(5,422 );
        recettesEndevisesMDH2016 = (double)file_xls.readCell(5,423 );
        recettesEndevisesMDH2017 = (double)file_xls.readCell(5,424 );
        recettesEndevisesMDH2018 = (double)file_xls.readCell(5,425 );
        recettesEndevisesMDH2019 = (double)file_xls.readCell(5,426 );
        recettesEndevisesMDH2020 = (double)file_xls.readCell(5,427 );
        recettesEndevisesMDH2021 = (double)file_xls.readCell(5,428 );
        recettesEndevisesMDH2022 = (double)file_xls.readCell(5,429 );
        recettesEndevisesMDH2023 = (double)file_xls.readCell(5,430 );
        recettesEndevisesMDH2024 = (double)file_xls.readCell(5,431 );
        recettesEndevisesMDH2025 = (double)file_xls.readCell(5,432 );
        recettesEndevisesMDH2026 = (double)file_xls.readCell(5,433 );
        recettesEndevisesMDH2027 = (double)file_xls.readCell(5,434 );
        recettesEndevisesMDH2028 = (double)file_xls.readCell(5,435 );
        recettesEndevisesMDH2029 = (double)file_xls.readCell(5,436 );
        recettesEndevisesMDH2030 = (double)file_xls.readCell(5,437 );

        // EBITDA (MDH) 																			
        EBITDAMDH2011 = (double)file_xls.readCell(5,439 );
        EBITDAMDH2012 = (double)file_xls.readCell(5,440 );
        EBITDAMDH2013 = (double)file_xls.readCell(5,441 );
        EBITDAMDH2014 = (double)file_xls.readCell(5,442 );
        EBITDAMDH2015 = (double)file_xls.readCell(5,443 );
        EBITDAMDH2016 = (double)file_xls.readCell(5,444 );
        EBITDAMDH2017 = (double)file_xls.readCell(5,445 );
        EBITDAMDH2018 = (double)file_xls.readCell(5,446 );
        EBITDAMDH2019 = (double)file_xls.readCell(5,447 );
        EBITDAMDH2020 = (double)file_xls.readCell(5,448 );
        EBITDAMDH2021 = (double)file_xls.readCell(5,449 );
        EBITDAMDH2022 = (double)file_xls.readCell(5,450 );
        EBITDAMDH2023 = (double)file_xls.readCell(5,451 );
        EBITDAMDH2024 = (double)file_xls.readCell(5,452 );
        EBITDAMDH2025 = (double)file_xls.readCell(5,453 );
        EBITDAMDH2026 = (double)file_xls.readCell(5,454 );
        EBITDAMDH2027 = (double)file_xls.readCell(5,455 );
        EBITDAMDH2028 = (double)file_xls.readCell(5,456 );
        EBITDAMDH2029 = (double)file_xls.readCell(5,457 );
        EBITDAMDH2030 = (double)file_xls.readCell(5,458 );

        // Amortissement (MDH) 	
        amortissementMDH2011 = (double)file_xls.readCell(5,462 );
        amortissementMDH2012 = (double)file_xls.readCell(5,463 );
        amortissementMDH2013 = (double)file_xls.readCell(5,464 );
        amortissementMDH2014 = (double)file_xls.readCell(5,465 );
        amortissementMDH2015 = (double)file_xls.readCell(5,466 );
        amortissementMDH2016 = (double)file_xls.readCell(5,467 );
        amortissementMDH2017 = (double)file_xls.readCell(5,468 );
        amortissementMDH2018 = (double)file_xls.readCell(5,469 );
        amortissementMDH2019 = (double)file_xls.readCell(5,470 );
        amortissementMDH2020 = (double)file_xls.readCell(5,471 );
        amortissementMDH2021 = (double)file_xls.readCell(5,472 );
        amortissementMDH2022 = (double)file_xls.readCell(5,473 );
        amortissementMDH2023 = (double)file_xls.readCell(5,474 );
        amortissementMDH2024 = (double)file_xls.readCell(5,475 );
        amortissementMDH2025 = (double)file_xls.readCell(5,476 );
        amortissementMDH2026 = (double)file_xls.readCell(5,477 );
        amortissementMDH2027 = (double)file_xls.readCell(5,478 );
        amortissementMDH2028 = (double)file_xls.readCell(5,479 );
        amortissementMDH2029 = (double)file_xls.readCell(5,480 );
        amortissementMDH2030 = (double)file_xls.readCell(5,481 );	
    
    // Résultat avant impôts (MDH)	
    resultatAvantImpotsMDH2011 = (double)file_xls.readCell(5,483 );
    resultatAvantImpotsMDH2012 = (double)file_xls.readCell(5,484 );
    resultatAvantImpotsMDH2013 = (double)file_xls.readCell(5,485 );
    resultatAvantImpotsMDH2014 = (double)file_xls.readCell(5,486 );
    resultatAvantImpotsMDH2015 = (double)file_xls.readCell(5,487 );
    resultatAvantImpotsMDH2016 = (double)file_xls.readCell(5,488 );
    resultatAvantImpotsMDH2017 = (double)file_xls.readCell(5,489 );
    resultatAvantImpotsMDH2018 = (double)file_xls.readCell(5,490 );
    resultatAvantImpotsMDH2019 = (double)file_xls.readCell(5,491 );
    resultatAvantImpotsMDH2020 = (double)file_xls.readCell(5,492 );
    resultatAvantImpotsMDH2021 = (double)file_xls.readCell(5,493 );
    resultatAvantImpotsMDH2022 = (double)file_xls.readCell(5,494 );
    resultatAvantImpotsMDH2023 = (double)file_xls.readCell(5,495 );
    resultatAvantImpotsMDH2024 = (double)file_xls.readCell(5,496 );
    resultatAvantImpotsMDH2025 = (double)file_xls.readCell(5,497 );
    resultatAvantImpotsMDH2026 = (double)file_xls.readCell(5,498 );
    resultatAvantImpotsMDH2027 = (double)file_xls.readCell(5,499 );
    resultatAvantImpotsMDH2028 = (double)file_xls.readCell(5,500 );
    resultatAvantImpotsMDH2029 = (double)file_xls.readCell(5,501 );
    resultatAvantImpotsMDH2030 = (double)file_xls.readCell(5,502 );

    // Impôts (MDH) 	
    impotsMDH2011 = (double)file_xls.readCell(5,504 );
    impotsMDH2012 = (double)file_xls.readCell(5,505 );
    impotsMDH2013 = (double)file_xls.readCell(5,506 );
    impotsMDH2014 = (double)file_xls.readCell(5,507 );
    impotsMDH2015 = (double)file_xls.readCell(5,508 );
    impotsMDH2016 = (double)file_xls.readCell(5,509 );
    impotsMDH2017 = (double)file_xls.readCell(5,510 );
    impotsMDH2018 = (double)file_xls.readCell(5,511 );
    impotsMDH2019 = (double)file_xls.readCell(5,512 );
    impotsMDH2020 = (double)file_xls.readCell(5,513 );
    impotsMDH2021 = (double)file_xls.readCell(5,514 );
    impotsMDH2022 = (double)file_xls.readCell(5,515 );
    impotsMDH2023 = (double)file_xls.readCell(5,516 );
    impotsMDH2024 = (double)file_xls.readCell(5,517 );
    impotsMDH2025 = (double)file_xls.readCell(5,518 );
    impotsMDH2026 = (double)file_xls.readCell(5,519 );
    impotsMDH2027 = (double)file_xls.readCell(5,520 );
    impotsMDH2028 = (double)file_xls.readCell(5,521 );
    impotsMDH2029 = (double)file_xls.readCell(5,522 );
    impotsMDH2030 = (double)file_xls.readCell(5,523 );

    // Dette (MDH) 																				
    pourcentageDette = (double)file_xls.readCell(5, 525);
    detteMDH2011 = (double)file_xls.readCell(5,526 );
    detteMDH2012 = (double)file_xls.readCell(5,527 );
    detteMDH2013 = (double)file_xls.readCell(5,528 );
    detteMDH2014 = (double)file_xls.readCell(5,529 );
    detteMDH2015 = (double)file_xls.readCell(5,530 );
    detteMDH2016 = (double)file_xls.readCell(5,531 );
    detteMDH2017 = (double)file_xls.readCell(5,532 );
    detteMDH2018 = (double)file_xls.readCell(5,533 );
    detteMDH2019 = (double)file_xls.readCell(5,534 );
    detteMDH2020 = (double)file_xls.readCell(5,535 );
    detteMDH2021 = (double)file_xls.readCell(5,536 );
    detteMDH2022 = (double)file_xls.readCell(5,537 );
    detteMDH2023 = (double)file_xls.readCell(5,538 );
    detteMDH2024 = (double)file_xls.readCell(5,539 );
    detteMDH2025 = (double)file_xls.readCell(5,540 );
    detteMDH2026 = (double)file_xls.readCell(5,541 );
    detteMDH2027 = (double)file_xls.readCell(5,542 );
    detteMDH2028 = (double)file_xls.readCell(5,543 );
    detteMDH2029 = (double)file_xls.readCell(5,544 );
    detteMDH2030 = (double)file_xls.readCell(5,545 );

    // TVA 			
    TVA2011 = (double)file_xls.readCell(5,548 );
    TVA2012 = (double)file_xls.readCell(5,549 );
    TVA2013 = (double)file_xls.readCell(5,550 );
    TVA2014 = (double)file_xls.readCell(5,551 );
    TVA2015 = (double)file_xls.readCell(5,552 );
    TVA2016 = (double)file_xls.readCell(5,553 );
    TVA2017 = (double)file_xls.readCell(5,554 );
    TVA2018 = (double)file_xls.readCell(5,555 );
    TVA2019 = (double)file_xls.readCell(5,556 );
    TVA2020 = (double)file_xls.readCell(5,557 );
    TVA2021 = (double)file_xls.readCell(5,558 );
    TVA2022 = (double)file_xls.readCell(5,559 );
    TVA2023 = (double)file_xls.readCell(5,560 );
    TVA2024 = (double)file_xls.readCell(5,561 );
    TVA2025 = (double)file_xls.readCell(5,562 );
    TVA2026 = (double)file_xls.readCell(5,563 );
    TVA2027 = (double)file_xls.readCell(5,564 );
    TVA2028 = (double)file_xls.readCell(5,565 );
    TVA2029 = (double)file_xls.readCell(5,566 );
    TVA2030 = (double)file_xls.readCell(5,567 );
    
    // Taxe professionnelle 					
    dateDebutApplicationTaxeProfessionelle = (double)file_xls.readCell(5,570 ); 
    valeurLocativeTaxeProfessionelle = (double)file_xls.readCell(5, 571);
    taxeProfessionnelle2011 = (double)file_xls.readCell(5,572 );
    taxeProfessionnelle2012 = (double)file_xls.readCell(5,573 );
    taxeProfessionnelle2013 = (double)file_xls.readCell(5,574 );
    taxeProfessionnelle2014 = (double)file_xls.readCell(5,575 );
    taxeProfessionnelle2015 = (double)file_xls.readCell(5,576 );
    taxeProfessionnelle2016 = (double)file_xls.readCell(5,577 );
    taxeProfessionnelle2017 = (double)file_xls.readCell(5,578 );
    taxeProfessionnelle2018 = (double)file_xls.readCell(5,579 );
    taxeProfessionnelle2019 = (double)file_xls.readCell(5,580 );
    taxeProfessionnelle2020 = (double)file_xls.readCell(5,581 );
    taxeProfessionnelle2021 = (double)file_xls.readCell(5,582 );
    taxeProfessionnelle2022 = (double)file_xls.readCell(5,583 );
    taxeProfessionnelle2023 = (double)file_xls.readCell(5,584 );
    taxeProfessionnelle2024 = (double)file_xls.readCell(5,585 );
    taxeProfessionnelle2025 = (double)file_xls.readCell(5,586 );
    taxeProfessionnelle2026 = (double)file_xls.readCell(5,587 );
    taxeProfessionnelle2027 = (double)file_xls.readCell(5,588 );
    taxeProfessionnelle2028 = (double)file_xls.readCell(5,589 );
    taxeProfessionnelle2029 = (double)file_xls.readCell(5,590 );
    taxeProfessionnelle2030 = (double)file_xls.readCell(5,591 );

    // taxe de services communaux 																					
    dateDebutApplicationTaxeServiceCommunaux = (double)file_xls.readCell(5,594 );
    taxeServicesCommunaux2011 = (double)file_xls.readCell(5,595 );
    taxeServicesCommunaux2012 = (double)file_xls.readCell(5,596 );
    taxeServicesCommunaux2013 = (double)file_xls.readCell(5,597 );
    taxeServicesCommunaux2014 = (double)file_xls.readCell(5,598 );
    taxeServicesCommunaux2015 = (double)file_xls.readCell(5,599 );
    taxeServicesCommunaux2016 = (double)file_xls.readCell(5,600 );
    taxeServicesCommunaux2017 = (double)file_xls.readCell(5,601 );
    taxeServicesCommunaux2018 = (double)file_xls.readCell(5,602 );
    taxeServicesCommunaux2019 = (double)file_xls.readCell(5,603 );
    taxeServicesCommunaux2020 = (double)file_xls.readCell(5,604 );
    taxeServicesCommunaux2021 = (double)file_xls.readCell(5,605 );
    taxeServicesCommunaux2022 = (double)file_xls.readCell(5,606 );
    taxeServicesCommunaux2023 = (double)file_xls.readCell(5,607 );
    taxeServicesCommunaux2024 = (double)file_xls.readCell(5,608 );
    taxeServicesCommunaux2025 = (double)file_xls.readCell(5,609 );
    taxeServicesCommunaux2026 = (double)file_xls.readCell(5,610 );
    taxeServicesCommunaux2027 = (double)file_xls.readCell(5,611 );
    taxeServicesCommunaux2028 = (double)file_xls.readCell(5,612 );
    taxeServicesCommunaux2029 = (double)file_xls.readCell(5,613 );
    taxeServicesCommunaux2030 = (double)file_xls.readCell(5,614 );

    // IR 		
    IR2011 = (double)file_xls.readCell(5,616 );
    IR2012 = (double)file_xls.readCell(5,617 );
    IR2013 = (double)file_xls.readCell(5,618 );
    IR2014 = (double)file_xls.readCell(5,619 );
    IR2015 = (double)file_xls.readCell(5,620 );
    IR2016 = (double)file_xls.readCell(5,621 );
    IR2017 = (double)file_xls.readCell(5,622 );
    IR2018 = (double)file_xls.readCell(5,623 );
    IR2019 = (double)file_xls.readCell(5,624 );
    IR2020 = (double)file_xls.readCell(5,625 );
    IR2021 = (double)file_xls.readCell(5,626 );
    IR2022 = (double)file_xls.readCell(5,627 );
    IR2023 = (double)file_xls.readCell(5,628 );
    IR2024 = (double)file_xls.readCell(5,629 );
    IR2025 = (double)file_xls.readCell(5,630 );
    IR2026 = (double)file_xls.readCell(5,631 );
    IR2027 = (double)file_xls.readCell(5,632 );
    IR2028 = (double)file_xls.readCell(5,633 );
    IR2029 = (double)file_xls.readCell(5,634 );
    IR2030 = (double)file_xls.readCell(5,635 );

    // Cash flow 	
    cashFlow2011 = (double)file_xls.readCell(5,637 );
    cashFlow2012 = (double)file_xls.readCell(5,638 );
    cashFlow2013 = (double)file_xls.readCell(5,639 );
    cashFlow2014 = (double)file_xls.readCell(5,640 );
    cashFlow2015 = (double)file_xls.readCell(5,641 );
    cashFlow2016 = (double)file_xls.readCell(5,642 );
    cashFlow2017 = (double)file_xls.readCell(5,643 );
    cashFlow2018 = (double)file_xls.readCell(5,644 );
    cashFlow2019 = (double)file_xls.readCell(5,645 );
    cashFlow2020 = (double)file_xls.readCell(5,646 );
    cashFlow2021 = (double)file_xls.readCell(5,647 );
    cashFlow2022 = (double)file_xls.readCell(5,648 );
    cashFlow2023 = (double)file_xls.readCell(5,649 );
    cashFlow2024 = (double)file_xls.readCell(5,650 );
    cashFlow2025 = (double)file_xls.readCell(5,651 );
    cashFlow2026 = (double)file_xls.readCell(5,652 );
    cashFlow2027 = (double)file_xls.readCell(5,653 );
    cashFlow2028 = (double)file_xls.readCell(5,654 );
    cashFlow2029 = (double)file_xls.readCell(5,655 );
    cashFlow2030 = (double)file_xls.readCell(5,656 );
    //TRI
    TRI = (double)file_xls.readCell(5,658 );

      System.out.println(TRI);
    }
}
