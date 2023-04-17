package com.example.ioexcel.io;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
    //*************************DEBUT DECLARATION VARIABLES***************************
        int anneeDebutPrevisionnelle;
        int totalEmlpois;
        int  nombreeEmploisTotalesCrees2011 ;
        int  nombreeEmploisTotalesCrees2012 ;
        int  nombreeEmploisTotalesCrees2013 ;
        int  nombreeEmploisTotalesCrees2014 ;
        int  nombreeEmploisTotalesCrees2015 ;
        int  nombreeEmploisTotalesCrees2016 ;
        int  nombreeEmploisTotalesCrees2017 ;
        int  nombreeEmploisTotalesCrees2018 ;
        int  nombreeEmploisTotalesCrees2019 ;
        int  nombreeEmploisTotalesCrees2020 ;
        int  nombreeEmploisTotalesCrees2021 ;
        int  nombreeEmploisTotalesCrees2022 ;
        int  nombreeEmploisTotalesCrees2023 ;
        int  nombreeEmploisTotalesCrees2024 ;
        int  nombreeEmploisTotalesCrees2025 ;
        int  nombreeEmploisTotalesCrees2026 ;
        int  nombreeEmploisTotalesCrees2027 ;
        int  nombreeEmploisTotalesCrees2028 ;
        int  nombreeEmploisTotalesCrees2029 ;
        int  nombreeEmploisTotalesCrees2030 ;
    
        int nombreEmploisDirectsCrees2011 ;
        int nombreEmploisDirectsCrees2012 ;
        int nombreEmploisDirectsCrees2013 ;
        int nombreEmploisDirectsCrees2014 ;
        int nombreEmploisDirectsCrees2015 ;
        int nombreEmploisDirectsCrees2016 ;
        int nombreEmploisDirectsCrees2017 ;
        int nombreEmploisDirectsCrees2018 ;
        int nombreEmploisDirectsCrees2019 ;
        int nombreEmploisDirectsCrees2020 ;
        int nombreEmploisDirectsCrees2021 ;
        int nombreEmploisDirectsCrees2022 ;
        int nombreEmploisDirectsCrees2023 ;
        int nombreEmploisDirectsCrees2024 ;
        int nombreEmploisDirectsCrees2025 ;
        int nombreEmploisDirectsCrees2026 ;
        int nombreEmploisDirectsCrees2027 ;
        int nombreEmploisDirectsCrees2028 ;
        int nombreEmploisDirectsCrees2029 ;
        int nombreEmploisDirectsCrees2030 ;
    
        int nombreEmploisIndirectsCrees2011 ;
        int nombreEmploisIndirectsCrees2012 ;
        int nombreEmploisIndirectsCrees2013 ;
        int nombreEmploisIndirectsCrees2014 ;
        int nombreEmploisIndirectsCrees2015 ;
        int nombreEmploisIndirectsCrees2016 ;
        int nombreEmploisIndirectsCrees2017 ;
        int nombreEmploisIndirectsCrees2018 ;
        int nombreEmploisIndirectsCrees2019 ;
        int nombreEmploisIndirectsCrees2020 ;
        int nombreEmploisIndirectsCrees2021 ;
        int nombreEmploisIndirectsCrees2022 ;
        int nombreEmploisIndirectsCrees2023 ;
        int nombreEmploisIndirectsCrees2024 ;
        int nombreEmploisIndirectsCrees2025 ;
        int nombreEmploisIndirectsCrees2026 ;
        int nombreEmploisIndirectsCrees2027 ;
        int nombreEmploisIndirectsCrees2028 ;
        int nombreEmploisIndirectsCrees2029 ;
        int nombreEmploisIndirectsCrees2030 ;
        
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
    
        int  investissementTourisqueEngage2011 ;
        int  investissementTourisqueEngage2012 ;
        int  investissementTourisqueEngage2013 ;
        int  investissementTourisqueEngage2014 ;
        int  investissementTourisqueEngage2015 ;
        int  investissementTourisqueEngage2016 ;
        int  investissementTourisqueEngage2017 ;
        int  investissementTourisqueEngage2018 ;
        int  investissementTourisqueEngage2019 ;
        int  investissementTourisqueEngage2020 ;
        int  investissementTourisqueEngage2021 ;
        int  investissementTourisqueEngage2022 ;
        int  investissementTourisqueEngage2023 ;
        int  investissementTourisqueEngage2024 ;
        int  investissementTourisqueEngage2025 ;
        int  investissementTourisqueEngage2026 ;
        int  investissementTourisqueEngage2027 ;
        int  investissementTourisqueEngage2028 ;
        int  investissementTourisqueEngage2029 ;
        int  investissementTourisqueEngage2030 ;
    
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
        int   nuitees_millionsdenuitees2011 ;
        int   nuitees_millionsdenuitees2012 ;
        int   nuitees_millionsdenuitees2013 ;
        int   nuitees_millionsdenuitees2014 ;
        int   nuitees_millionsdenuitees2015 ;
        int   nuitees_millionsdenuitees2016 ;
        int   nuitees_millionsdenuitees2017 ;
        int   nuitees_millionsdenuitees2018 ;
        int   nuitees_millionsdenuitees2019 ;
        int   nuitees_millionsdenuitees2020 ;
        int   nuitees_millionsdenuitees2021 ;
        int   nuitees_millionsdenuitees2022 ;
        int   nuitees_millionsdenuitees2023 ;
        int   nuitees_millionsdenuitees2024 ;
        int   nuitees_millionsdenuitees2025 ;
        int   nuitees_millionsdenuitees2026 ;
        int   nuitees_millionsdenuitees2027 ;
        int   nuitees_millionsdenuitees2028 ;
        int   nuitees_millionsdenuitees2029 ;
        int   nuitees_millionsdenuitees2030 ;
    
        int    arrivéesMillionsTouristes2011 ;
        int    arrivéesMillionsTouristes2012 ;
        int    arrivéesMillionsTouristes2013 ;
        int    arrivéesMillionsTouristes2014 ;
        int    arrivéesMillionsTouristes2015 ;
        int    arrivéesMillionsTouristes2016 ;
        int    arrivéesMillionsTouristes2017 ;
        int    arrivéesMillionsTouristes2018 ;
        int    arrivéesMillionsTouristes2019 ;
        int    arrivéesMillionsTouristes2020 ;
        int    arrivéesMillionsTouristes2021 ;
        int    arrivéesMillionsTouristes2022 ;
        int    arrivéesMillionsTouristes2023 ;
        int    arrivéesMillionsTouristes2024 ;
        int    arrivéesMillionsTouristes2025 ;
        int    arrivéesMillionsTouristes2026 ;
        int    arrivéesMillionsTouristes2027 ;
        int    arrivéesMillionsTouristes2028 ;
        int    arrivéesMillionsTouristes2029 ;
        int    arrivéesMillionsTouristes2030 ;
    
        int arriveesTESMillionsTouristes2011 ;
        int arriveesTESMillionsTouristes2012 ;
        int arriveesTESMillionsTouristes2013 ;
        int arriveesTESMillionsTouristes2014 ;
        int arriveesTESMillionsTouristes2015 ;
        int arriveesTESMillionsTouristes2016 ;
        int arriveesTESMillionsTouristes2017 ;
        int arriveesTESMillionsTouristes2018 ;
        int arriveesTESMillionsTouristes2019 ;
        int arriveesTESMillionsTouristes2020 ;
        int arriveesTESMillionsTouristes2021 ;
        int arriveesTESMillionsTouristes2022 ;
        int arriveesTESMillionsTouristes2023 ;
        int arriveesTESMillionsTouristes2024 ;
        int arriveesTESMillionsTouristes2025 ;
        int arriveesTESMillionsTouristes2026 ;
        int arriveesTESMillionsTouristes2027 ;
        int arriveesTESMillionsTouristes2028 ;
        int arriveesTESMillionsTouristes2029 ;
        int arriveesTESMillionsTouristes2030 ;
    
        int  arriveesInterneMillionsTouristes2011 ;
        int  arriveesInterneMillionsTouristes2012 ;
        int  arriveesInterneMillionsTouristes2013 ;
        int  arriveesInterneMillionsTouristes2014 ;
        int  arriveesInterneMillionsTouristes2015 ;
        int  arriveesInterneMillionsTouristes2016 ;
        int  arriveesInterneMillionsTouristes2017 ;
        int  arriveesInterneMillionsTouristes2018 ;
        int  arriveesInterneMillionsTouristes2019 ;
        int  arriveesInterneMillionsTouristes2020 ;
        int  arriveesInterneMillionsTouristes2021 ;
        int  arriveesInterneMillionsTouristes2022 ;
        int  arriveesInterneMillionsTouristes2023 ;
        int  arriveesInterneMillionsTouristes2024 ;
        int  arriveesInterneMillionsTouristes2025 ;
        int  arriveesInterneMillionsTouristes2026 ;
        int  arriveesInterneMillionsTouristes2027 ;
        int  arriveesInterneMillionsTouristes2028 ;
        int  arriveesInterneMillionsTouristes2029 ;
        int  arriveesInterneMillionsTouristes2030 ;
    
        int   arriveesTESAerienMillionsTouristes2011 ;
        int   arriveesTESAerienMillionsTouristes2012 ;
        int   arriveesTESAerienMillionsTouristes2013 ;
        int   arriveesTESAerienMillionsTouristes2014 ;
        int   arriveesTESAerienMillionsTouristes2015 ;
        int   arriveesTESAerienMillionsTouristes2016 ;
        int   arriveesTESAerienMillionsTouristes2017 ;
        int   arriveesTESAerienMillionsTouristes2018 ;
        int   arriveesTESAerienMillionsTouristes2019 ;
        int   arriveesTESAerienMillionsTouristes2020 ;
        int   arriveesTESAerienMillionsTouristes2021 ;
        int   arriveesTESAerienMillionsTouristes2022 ;
        int   arriveesTESAerienMillionsTouristes2023 ;
        int   arriveesTESAerienMillionsTouristes2024 ;
        int   arriveesTESAerienMillionsTouristes2025 ;
        int   arriveesTESAerienMillionsTouristes2026 ;
        int   arriveesTESAerienMillionsTouristes2027 ;
        int   arriveesTESAerienMillionsTouristes2028 ;
        int   arriveesTESAerienMillionsTouristes2029 ;
        int   arriveesTESAerienMillionsTouristes2030 ;
        
        int    arriveesInterneAerienMillionsTouristes2011 ;
        int    arriveesInterneAerienMillionsTouristes2012 ;
        int    arriveesInterneAerienMillionsTouristes2013 ;
        int    arriveesInterneAerienMillionsTouristes2014 ;
        int    arriveesInterneAerienMillionsTouristes2015 ;
        int    arriveesInterneAerienMillionsTouristes2016 ;
        int    arriveesInterneAerienMillionsTouristes2017 ;
        int    arriveesInterneAerienMillionsTouristes2018 ;
        int    arriveesInterneAerienMillionsTouristes2019 ;
        int    arriveesInterneAerienMillionsTouristes2020 ;
        int    arriveesInterneAerienMillionsTouristes2021 ;
        int    arriveesInterneAerienMillionsTouristes2022 ;
        int    arriveesInterneAerienMillionsTouristes2023 ;
        int    arriveesInterneAerienMillionsTouristes2024 ;
        int    arriveesInterneAerienMillionsTouristes2025 ;
        int    arriveesInterneAerienMillionsTouristes2026 ;
        int    arriveesInterneAerienMillionsTouristes2027 ;
        int    arriveesInterneAerienMillionsTouristes2028 ;
        int    arriveesInterneAerienMillionsTouristes2029 ;
        int    arriveesInterneAerienMillionsTouristes2030 ;
    
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
    
        int      resultatAvantImpotsMDH2011 ;
        int      resultatAvantImpotsMDH2012 ;
        int      resultatAvantImpotsMDH2013 ;
        int      resultatAvantImpotsMDH2014 ;
        int      resultatAvantImpotsMDH2015 ;
        int      resultatAvantImpotsMDH2016 ;
        int      resultatAvantImpotsMDH2017 ;
        int      resultatAvantImpotsMDH2018 ;
        int      resultatAvantImpotsMDH2019 ;
        int      resultatAvantImpotsMDH2020 ;
        int      resultatAvantImpotsMDH2021 ;
        int      resultatAvantImpotsMDH2022 ;
        int      resultatAvantImpotsMDH2023 ;
        int      resultatAvantImpotsMDH2024 ;
        int      resultatAvantImpotsMDH2025 ;
        int      resultatAvantImpotsMDH2026 ;
        int      resultatAvantImpotsMDH2027 ;
        int      resultatAvantImpotsMDH2028 ;
        int      resultatAvantImpotsMDH2029 ;
        int      resultatAvantImpotsMDH2030 ;
    
        int       impotsMDH2011 ;
        int       impotsMDH2012 ;
        int       impotsMDH2013 ;
        int       impotsMDH2014 ;
        int       impotsMDH2015 ;
        int       impotsMDH2016 ;
        int       impotsMDH2017 ;
        int       impotsMDH2018 ;
        int       impotsMDH2019 ;
        int       impotsMDH2020 ;
        int       impotsMDH2021 ;
        int       impotsMDH2022 ;
        int       impotsMDH2023 ;
        int       impotsMDH2024 ;
        int       impotsMDH2025 ;
        int       impotsMDH2026 ;
        int       impotsMDH2027 ;
        int       impotsMDH2028 ;
        int       impotsMDH2029 ;
        int       impotsMDH2030 ;
    
        int        pourcentageDette;
        double        DetteMDH2011 ;
        double        DetteMDH2012 ;
        double        DetteMDH2013 ;
        double        DetteMDH2014 ;
        double        DetteMDH2015 ;
        double        DetteMDH2016 ;
        double        DetteMDH2017 ;
        double        DetteMDH2018 ;
        double        DetteMDH2019 ;
        double        DetteMDH2020 ;
        double        DetteMDH2021 ;
        double        DetteMDH2022 ;
        double        DetteMDH2023 ;
        double        DetteMDH2024 ;
        double        DetteMDH2025 ;
        double        DetteMDH2026 ;
        double        DetteMDH2027 ;
        double        DetteMDH2028 ;
        double        DetteMDH2029 ;
        double        DetteMDH2030 ;
    
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
        
        int         dateDebutApplicationRaxeProfessionelle;
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
    
        int          dateDebutApplicationTaxeServiceCommunaux;
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
        int TRI;
    //************************FIN DECLARATION VARIABLES**************************** 

        int column = 1; //Initialisation de la colone
        ExcelFile file_xls = new ExcelFile("Canevas.xlsx"); 
        file_xls.chooseSheet(4);

    //    //********************************INSERTION****************************
    //     file_xls.writeCell(5, column++, 1);
    //     file_xls.writeCell(5, column++, "Commerces/ restauration");
    //     file_xls.writeCell(5, column++, "Benslimane");
    //     file_xls.writeCell(5, column++, 50);
    //     file_xls.writeCell(5, column++, 0);
    //     file_xls.writeCell(5, column++, 1);
    //     file_xls.writeCell(5, column++, 0);
    //     file_xls.writeCell(5, column++, 16);
    //     file_xls.writeCell(5, column++, 64);
    //     file_xls.writeCell(5, column++, 2026);
    //     column++;    
    //     file_xls.writeCell(5, column++, 2);
    //     column++;//séparateur

    //     // Nombre d'emplois Totales crées 																			
    //     for(int year =2011; year<=2030; year++){column++;}
    //     column++;//séparateur
        
    //     // Nombre d'emplois directs crées 																			
    //     for(int year =2011; year<=2030; year++){column++;}
    //     column++;//séparateur

    //     // Nombre d'emplois indirects crées 																			
    //     for(int year =2011; year<=2030; year++){column++;}
    //     column++;//séparateur

    //     // Séquençage investissements en 0% 														
    //     for(int year =2011; year<=2030; year++){column++;}
    //     column++;//séparateur

    //     // Investissement tourisque engagé  	
    //     for(int year =2011; year<=2030; year++){column++;}
    //     column++;//séparateur
        
    //     // séquençage de l'investissement tourisque  
    //     for(int year =2011; year<=2030; year++){column++;}
    //     column++;//séparateur
        
    //     // séquençage de la capacité   	
    //     for(int year =2011; year<=2030; year++){column++;}
    //     column++;//séparateur
        
    //     // Investissement Public engagement ( Mdh)  
    //     for(int year =2011; year<=2030; year++){column++;}
    //     column++;//séparateur
        
    //     // Investissement privé engagement ( en MDH)  	
    //     for(int year =2011; year<=2030; year++){column++;}
    //     column++; column++;//séparateur

    //     // Quote part TES
    //     file_xls.writeCell(5, column++, 0.3,"0%");
    //     column++;//séparateur 
        
    //     // TO & DMS 					
    //     column++; //TOA 1
    //     column++; //TOA 2
    //     column++; //TOA 3
    //     file_xls.writeCell(5, column++, 0.5,"0%");
    //     file_xls.writeCell(5, column++, 2);
    //     file_xls.writeCell(5, column++, 1.2);
    //     column++;//séparateur

    //     // Nuitées (millions de nuitées) 		
    //     for(int year =2011; year<=2030; year++){column++;}
    //     column++;//séparateur
        
    //     // Arrivées (millions de touristes) 														
    //     for(int year =2011; year<=2030; year++){column++;}
    //     column++;//séparateur

    //     // Arrivées TES (millions de touristes) 														
    //     for(int year =2011; year<=2030; year++){column++;}
    //     column++;//séparateur
        
    //     // Arrivées Interne (millions de touristes) 														
    //     for(int year =2011; year<=2030; year++){column++;}
    //     column++;//séparateur

    //     // Flux aéroports 
    //     file_xls.writeCell(5, column++, 1,"0%");

    //     // Arrivées TES aérien (millions de touristes) 																			
    //     for(int year =2011; year<=2030; year++){column++;}
    //     file_xls.writeCell(5, column++,0,"0%");//0% arrivées internes par aérien

    //     // Arrivées Interne aérien (millions de touristes) 	
    //     for(int year =2011; year<=2030; year++){column++;}
    //     file_xls.writeCell(5, column++,"Mohammed V"); //Aéroport utilisé
    //     column++;//séparateur
        
    //     // Charges exploitation					
    //     file_xls.writeCell(5, column++, 60000);// Salaire moyen par employé - DH/an

    //     file_xls.writeCell(5, column++, 0.6,"0%");
    //     file_xls.writeCell(5, column++, 0.9,"0%");
    //     file_xls.writeCell(5, column++, 1.2,"0%");
    //     file_xls.writeCell(5, column++, 1.24,"0%");
    //     file_xls.writeCell(5, column++, 0.02,"0%");
    //     column++;//séparateur

    //     // Charges personnel (MDH) 	
    //     for(int year =2011; year<=2030; year++){column++;}
    //     column++;//séparateur
        
    //     // Autres charges exploitation (MDH) 																			
    //     for(int year =2011; year<=2030; year++){column++;}
    //     column++;//séparateur

    //     //  Marge brute (EBITDA/CA) 
    //     file_xls.writeCell(5, column++, 0.3,"0%");
    //     file_xls.writeCell(5, column++, 0.42,"0%");
    //     file_xls.writeCell(5, column++, 0.53,"0%");
    //     file_xls.writeCell(5, column++, 0.55,"0%");
    //     file_xls.writeCell(5, column++, 0.02,"0%");
    //     column++;//séparateur

    //     //  Recettes (MDH) 																			
    //     for(int year =2011; year<=2030; year++){column++;}
    //     column++;//séparateur

    //     //  0% TES 
    //     file_xls.writeCell(5, column++, 0.3,"0%");

    //     //  Recettes en devises (MDH) 																			
    //     for(int year =2011; year<=2030; year++){column++;}
    //     column++;//séparateur

    //     //  EBITDA (MDH) 																			
    //     for(int year =2011; year<=2030; year++){column++;}
    //     column++;//séparateur

    //     // Amortissement (ans)
    //     file_xls.writeCell(5, column++, 12);
    //     column++;//séparateur
        
    //     // Amortissement (MDH) 	
    //     for(int year =2011; year<=2030; year++){column++;}
    //     column++;//séparateur

    //     // Résultat avant impôts (MDH)																			
    //     for(int year =2011; year<=2030; year++){column++;}
    //     column++;//séparateur

    //     //  Impôts (MDH) 
    //     for(int year =2011; year<=2030; year++){column++;}
    //     column++;//séparateur
        
    //     //  Dette (MDH) 
    //     column++; //0%dette																				
    //     for(int year =2011; year<=2030; year++){column++;}
    //     column++;//séparateur

    //     file_xls.writeCell(5, column++, 0.2,"0%");//Taux TVA

    //     // TVA 																				
    //     for(int year =2011; year<=2030; year++){column++;}
    //     column++;//séparateur

    //     file_xls.writeCell(5, column++, 0.3,"0%");// Taux de la Taxe professionnelle
        
    //     // Taxe professionnelle 																						
    //     column++;// Date de début d'application
    //     column++;//  Valeur locative 
    //     for(int year =2011; year<=2030; year++){column++;}
    //     column++;//séparateur

    //     // taxe de services communaux 																					
    //     file_xls.writeCell(5, column++, 0.11,"0%");// Taux de la taxe de services communaux
    //     column++;// Date de début d'application
    //     for(int year =2011; year<=2030; year++){column++;}
    //     column++;//séparateur
        
    //     // IR 																			
    //     for(int year =2011; year<=2030; year++){column++;}
    //     column++;//séparateur

    //     // Cash flow 
    //     for(int year =2011; year<=2030; year++){column++;}
    //     column++;//séparateur		
        
    //     // TRI
    //     column++;//séparateur		
    //    //********************************END_INSERTION****************************


       //*****************************LECTURE DES RESULTATS***********************
       anneeDebutPrevisionnelle = (int) file_xls.readCell(5, 11);
       totalEmlpois = (int) file_xls.readCell(5, 13);
       nombreeEmploisTotalesCrees2011 = (int)file_xls.readCell(5,15 );
       nombreeEmploisTotalesCrees2012 = (int)file_xls.readCell(5,16 );
       nombreeEmploisTotalesCrees2013 = (int)file_xls.readCell(5,17 );
       nombreeEmploisTotalesCrees2014 = (int)file_xls.readCell(5,18 );
       nombreeEmploisTotalesCrees2015 = (int)file_xls.readCell(5,19 );
       nombreeEmploisTotalesCrees2016 = (int)file_xls.readCell(5,20 );
       nombreeEmploisTotalesCrees2017 = (int)file_xls.readCell(5,21 );
       nombreeEmploisTotalesCrees2018 = (int)file_xls.readCell(5,22 );
       nombreeEmploisTotalesCrees2019 = (int)file_xls.readCell(5,23 );
       nombreeEmploisTotalesCrees2020 = (int)file_xls.readCell(5,24 );
       nombreeEmploisTotalesCrees2021 = (int)file_xls.readCell(5,25 );
       nombreeEmploisTotalesCrees2022 = (int)file_xls.readCell(5,26 );
       nombreeEmploisTotalesCrees2023 = (int)file_xls.readCell(5,27 );
       nombreeEmploisTotalesCrees2024 = (int)file_xls.readCell(5,28 );
       nombreeEmploisTotalesCrees2025 = (int)file_xls.readCell(5,29 );
       nombreeEmploisTotalesCrees2026 = (int)file_xls.readCell(5,30 );
       nombreeEmploisTotalesCrees2027 = (int)file_xls.readCell(5,31 );
       nombreeEmploisTotalesCrees2028 = (int)file_xls.readCell(5,32 );
       nombreeEmploisTotalesCrees2029 = (int)file_xls.readCell(5,33 );
       nombreeEmploisTotalesCrees2030 = (int)file_xls.readCell(5,34 );
       
       chargesPersonnelMDH2030 = (double)file_xls.readCell(5,367);
       TO_A1 = (double)file_xls.readCell(5,206 );
        

    //    for(int i=2011,j=15; i<=2030;i++,j++){
    //     System.out.println("nombreeEmploisTotalesCrees"+i+" = (int)file_xls.readCell(5,"+j+" );");
    //    }

    //test recupération des différents types
       System.out.println("anneeDebutPrevisionnelle---->"+anneeDebutPrevisionnelle);
       System.out.println("totalEmlpois-------->"+totalEmlpois);
       System.out.println("nombreeEmploisTotalesCrees2026-------->"+nombreeEmploisTotalesCrees2026);
       System.out.println("chargesPersonnelMDH2030------->"+chargesPersonnelMDH2030);
       System.out.println("TO_A1------->"+TO_A1);
    }
}
