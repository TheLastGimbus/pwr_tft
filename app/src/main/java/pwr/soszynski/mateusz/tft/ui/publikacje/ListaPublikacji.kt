package pwr.soszynski.mateusz.tft.ui.publikacje

data class Pub(
    val year: Int,
    val authors: List<String>,
    val title: String,
    val url: String
)

val publikacje = listOf(
    Pub(
        2024,
        listOf("Michał M. Mazur", "Wiktoria Weichbrodt", "Paulina Kapuścik", "Jarosław Domaradzki", "Piotr Mazur"),
        "Enhancement of gasochromic response to hydrogen of WO₃ thin films by post-process modification and catalyst selection.",
        "https://doi.org/10.1016/j.ijhydene.2024.07.112"
    ),
    Pub(
        2024,
        listOf(
            "Milena Kiliszkiewicz",
            "Jarosław Domaradzki",
            "Witold Posadowski",
            "Michał M. Mazur",
            "Artur Wiatrowski",
            "Wojciech Dawidowski",
            "Piotr Mazur",
            "Damian Wojcieszak",
            "Paweł Chodasewicz",
            "Mateusz Bartczak"
        ),
        "Effect of sputtering power and oxygen partial pressure on structural and opto-electronic properties of Al-doped ZnO transparent conducting oxides",
        "https://doi.org/10.1016/j.apsusc.2024.160601"
    ),
    Pub(
        2024,
        listOf(
            "Paulina Kapuścik",
            "Damian Wojcieszak",
            "Patrycja A. Pokora",
            "Ewa Mańkowska",
            "Jarosław Domaradzki",
            "Michał M. Mazur",
            "Piotr Mazur",
            "Julia Kosto",
            "Carlos Morales",
            "Małgorzata Kot",
            "Jan Ingo Flege"
        ),
        "Low temperature hydrogen sensor with high sensitivity based on CeOx thin film.",
        "https://doi.org/10.1016/j.snb.2024.136148"
    ),
    Pub(
        2024,
        listOf("Patrycja A. Pokora", "Damian Wojcieszak", "Jarosław Domaradzki", "Paulina Kapuścik"),
        "Surface and electrical characterization of non-stoichiometric semiconducting thin-film coatings based on Ti-Co mixed oxides obtained by gas impulse magnetron sputtering",
        "https://doi.org/10.3390/coatings14010059"
    ),
    Pub(
        2024,
        listOf(
            "Michał M. Mazur",
            "Milena Kiliszkiewicz",
            "Witold Posadowski",
            "Jarosław Domaradzki",
            "Aleksandra M. Małachowska",
            "Paweł S. Sokołowski"
        ),
        "A comprehensive investigation of the mechanical and tribological properties of AZO transparent conducting oxide thin films deposited by medium frequency magnetron sputtering.",
        "https://doi.org/10.3390/ma17010081"
    ),
    Pub(
        2023,
        listOf(
            "Jarosław Domaradzki",
            "Michał Mazur",
            "Damian Wojcieszak",
            "Artur Wiatrowski",
            "Ewa Mańkowska",
            "Paweł Chodasewicz"
        ),
        "Reverse Engineering Analysis of Optical Properties of (Ti,Cu)Ox Gradient Thin Film Coating",
        "https://doi.org/10.3390/coatings13061012"
    ),
    Pub(
        2023,
        listOf(
            "Ewa Mańkowska",
            "Michał M. Mazur",
            "Jarosław Domaradzki",
            "Piotr Mazur",
            "Małgorzata Kot",
            "Jan Ingo Flege"
        ),
        "Hydrogen gas sensing properties of mixed copper–titanium oxide thin films.",
        "https://doi.org/10.3390/s23083822"
    ),
    Pub(
        2023,
        listOf("Michał M. Mazur", "Jarosław Domaradzki", "Tomasz Jędrzejak", "Damian Wojcieszak"),
        "Coloration mechanism in gasochromic thin films through the analysis of a complex refractive index.",
        "https://doi.org/10.1364/AO.474012"
    ),
    Pub(
        2023,
        listOf("Damian Wojcieszak", "Paulina Kapuścik", "Wojciech Kijaszek"),
        "Influence of annealing on gas-sensing properties of TiOx coatings prepared by gas impulse magnetron sputtering with various O₂ content.",
        "https://doi.org/10.3390/app13031724"
    ),
    Pub(
        2023,
        listOf("Malwina Sikora", "Damian Wojcieszak", "Aleksandra Chudzyńska", "Aneta Zięba"),
        "Improved methodology of cross-sectional SEM analysis of thin-film multilayers prepared by magnetron sputtering.",
        "https://doi.org/10.3390/coatings13020316"
    ),
    Pub(
        2023,
        listOf("Ewa Mańkowska", "Michał Mazur", "Jarosław Domaradzki", "Damian Wojcieszak"),
        "P-type (CuTi)Ox thin films deposited by magnetron co-sputtering and their electronic and hydrogen sensing properties.",
        "https://doi.org/10.3390/coatings13020220"
    ),
    Pub(
        2023,
        listOf(
            "Wojciech Kijaszek",
            "Artur Wiatrowski",
            "Michał M. Mazur",
            "Damian Wojcieszak",
            "Regina Paszkiewicz",
            "Jaroslav Jr. Kovăč"
        ),
        "Study on properties of diamond-like carbon films deposited by RF ICP PECVD method for micro- and optoelectronic applications.",
        "https://doi.org/10.1016/j.mseb.2023.116691"
    ),
    Pub(
        2023,
        listOf(
            "Ammara Ejaz",
            "Michael McKinlay",
            "Sam Ahmadzadeh",
            "Manuel Pelayo Garcia",
            "Lewis Fleming",
            "Piotr Mazur",
            "Michał M. Mazur",
            "Des Gibson",
            "Carlos Garcia Nuñez"
        ),
        "Investigation and band gap analysis of pulsed DC magnetron sputtered diamond-like carbon to enhance contact-electrification and durability of triboelectric nanogenerators.",
        "https://doi.org/10.1002/admt.202300450"
    ),
    Pub(
        2023,
        listOf("Jerzy Dora", "Damian Wojcieszak", "Dorota Świątek", "Michał M. Mazur", "Jarosław Domaradzki"),
        "Treatment of tinnitus using sound therapy in the form of a mono signal with a frequency consistent with the natural vibrations of the cilia in the Corti organ.",
        "https://doi.org/10.1016/j.mehy.2023.111171"
    ),
    Pub(
        2023,
        listOf("Patrycja A. Pokora", "Damian Wojcieszak", "Piotr Mazur", "Małgorzata Kalisz", "Malwina Sikora"),
        "Influence of co-content on the optical and structural properties of TiOx thin films prepared by gas impulse magnetron sputtering.",
        "https://doi.org/10.3390/coatings13050955"
    ),
    Pub(
        2022,
        listOf(
            "Damian Wojcieszak",
            "Agata Obstarczyk",
            "Ewa Mańkowska",
            "Michał Mazur",
            "Danuta Kaczmarek",
            "Katarzyna Zakrzewska",
            "Piotr Mazur",
            "Jarosław Domaradzki"
        ),
        "Thermal oxidation impact on the optoelectronic and hydrogen sensing properties of p-type copper oxide thin films.",
        "https://doi.org/10.1016/j.materresbull.2021.111646"
    ),
    Pub(
        2022,
        listOf("Jerzy Dora", "Damian Wojcieszak", "Michał Mazur", "Danuta Kaczmarek"),
        "Experimental verification of a new theory of acoustic signal detection in the inner ear related to noncontact detection of potential changes on the tectorial membrane.",
        "https://doi.org/10.1016/j.apacoust.2022.108659"
    ),
    Pub(
        2022,
        listOf(
            "Artur Wiatrowski",
            "Damian Wojcieszak",
            "Michał Mazur",
            "Danuta Kaczmarek",
            "Jarosław Domaradzki",
            "Małgorzata Kalisz",
            "Wojciech Kijaszek",
            "Patrycja Pokora",
            "Ewa Mańkowska",
            "Aneta Lubańska",
            "Malwina Sikora"
        ),
        "Photocatalytic coatings based on TiOx for application on flexible glass for photovoltaic panels.",
        "https://doi.org/10.1007/s11665-022-06655-1"
    ),
    Pub(
        2022,
        listOf("Damian Wojcieszak", "Jarosław Domaradzki", "Michał Mazur", "Tomasz Kotwica", "Danuta Kaczmarek"),
        "Investigation of a memory effect in a Au/(Ti-Cu)Ox-gradient thin film/TiAlV structure.",
        "https://doi.org/10.3762/bxiv.2021.72.v1"
    ),
    Pub(
        2021,
        listOf(
            "Małgorzata Osękowska",
            "Damian Wojcieszak",
            "Danuta Kaczmarek",
            "Michał Mazur",
            "Agata Obstarczyk",
            "Bogumiła Szponar"
        ),
        "Multifunctional nanocrystalline Cu-Ti thin film enhance survival and induce proliferation of mouse fibroblasts in vitro.",
        "https://doi.org/10.3390/coatings11030300"
    ),
    Pub(
        2021,
        listOf("Marcin Winnicki", "Artur Wiatrowski", "Michał Mazur"),
        "High power impulse magnetron sputtering of In₂O₃/Sn cold sprayed composite target.",
        "https://doi.org/10.3390/ma14051228"
    ),
    Pub(
        2021,
        listOf(
            "Damian Wojcieszak",
            "Michał Mazur",
            "Patrycja Pokora",
            "Adriana Wrona",
            "Katarzyna Bilewska",
            "Wojciech Kijaszek",
            "Tomasz Kotwica",
            "Witold Posadowski",
            "Jarosław Domaradzki"
        ),
        "Properties of metallic and oxide thin films based on Ti and Co prepared by magnetron sputtering from sintered targets with different Co-content.",
        "https://doi.org/10.3390/ma14143797"
    ),
    Pub(
        2021,
        listOf(
            "Michał Mazur",
            "Damian Wojcieszak",
            "Artur Wiatrowski",
            "Danuta Kaczmarek",
            "Aneta Lubańska",
            "Jarosław Domaradzki",
            "Piotr Mazur",
            "Małgorzata Kalisz"
        ),
        "Analysis of amorphous tungsten oxide thin films deposited by magnetron sputtering for application in transparent electronics.",
        "https://doi.org/10.1016/j.apsusc.2021.151151"
    ),
    Pub(
        2020,
        listOf(
            "Dominika Trefon-Radziejewska",
            "Justyna Juszczyk",
            "Austin Fleming",
            "Jacek Podwórny",
            "Mihai Chirtoc",
            "Nicolas Horny",
            "Adriana Wrona",
            "Marcin Lis",
            "Michał Mazur",
            "Damian Wojcieszak",
            "Danuta Kaczmarek",
            "Jerzy Bodzenta"
        ),
        "Thermophysical properties of refractory W-50.4%Re and Mo-39.5%Re thin alloy layers deposited on silicon and silica substrates.",
        "https://doi.org/10.1016/j.ijrmhm.2019.105147"
    ),
    Pub(
        2020,
        listOf(
            "Agata Obstarczyk",
            "Michał Mazur",
            "Danuta Kaczmarek",
            "Jarosław Domaradzki",
            "Damian Wojcieszak",
            "Marcin Grobelny"
        ),
        "Influence of post-process annealing temperature on structural, optical, mechanical and corrosion properties of mixed TiO₂-WO₃ thin films.",
        "https://doi.org/10.1016/j.tsf.2020.137856"
    ),
    Pub(
        2020,
        listOf("Jerzy Dora", "Damian Wojcieszak", "Danuta Kaczmarek", "Michał Mazur", "Andrzej Aksenczuk"),
        "New theory of acoustic signal detection in the inner ear – An explanation of bifilar structure of the cochlea.",
        "https://doi.org/10.1016/j.mehy.2020.109636"
    ),
    Pub(
        2020,
        listOf(
            "Damian Wojcieszak",
            "Małgorzata Osekowska",
            "Danuta Kaczmarek",
            "Bogumiła Szponar",
            "Michał Mazur",
            "Piotr Mazur",
            "Agata Obstarczyk"
        ),
        "Influence of material composition on structure, surface properties and biological activity of nanocrystalline coatings based on Cu and Ti.",
        "https://doi.org/10.3390/coatings10040343"
    ),
    Pub(
        2019,
        listOf("Bogdan Adamiak", "Artur Wiatrowski", "J. Domaradzki", "D. Kaczmarek", "D. Wojcieszak", "M. Mazur"),
        "Preparation of multicomponent thin films by magnetron co-sputtering method: the Cu-Ti case study.",
        "https://doi.org/10.1016/j.vacuum.2019.01.012"
    ),
    Pub(
        2019,
        listOf("Artur Wiatrowski", "Agata Obstarczyk", "Michał Mazur", "Danuta Kaczmarek", "Damian Wojcieszak"),
        "Characterization of HfO₂ optical coatings deposited by MF magnetron sputtering.",
        "https://doi.org/10.3390/COATINGS9020106"
    ),
    Pub(
        2019,
        listOf(
            "Agata Obstarczyk",
            "Danuta Kaczmarek",
            "Damian Wojcieszak",
            "Michał Mazur",
            "Jarosław Domaradzki",
            "Tomasz Kotwica",
            "Roman Pastuszek",
            "Dieter Schmeisser",
            "Piotr Mazur",
            "Małgorzata Kot"
        ),
        "Tailoring optical and electrical properties of thin-film coatings based on mixed Hf and Ti oxides for optoelectronic application.",
        "https://doi.org/10.1016/j.matdes.2019.107822"
    ),
    Pub(
        2019,
        listOf(
            "Agata Obstarczyk",
            "Danuta Kaczmarek",
            "Michał Mazur",
            "Jarosław Domaradzki",
            "Damian Wojcieszak",
            "Tomasz Kotwica",
            "Jerzy Morgiel"
        ),
        "The effect of post-process annealing on optical and electrical properties of mixed HfO₂–TiO₂ thin film coatings.",
        "https://doi.org/10.1007/s10854-019-00938-5"
    ),
    Pub(
        2018,
        listOf("Jaroslaw Domaradzki", "Michał Mazur", "Tomasz Kotwica"),
        "Analysis of memristor-like behaviors in Au/Ti52Cu48Ox/TiAlV structure with gradient elements distribution.",
        "https://doi.org/10.1016/j.mssp.2018.07.025"
    ),
    Pub(
        2018,
        listOf("Jarosław Domaradzki", "Tomasz Kotwica", "Michał Mazur", "Danuta Kaczmarek", "Damian Wojcieszak"),
        "Memristive properties of transparent oxide semiconducting (Ti,Cu)Ox-gradient thin film.",
        "https://doi.org/10.1088/1361-6641/aa98ce"
    ),
    Pub(
        2018,
        listOf("Słówko Witold", "Wiatrowski Artur", "Krysztof Michał"),
        "Detection of secondary and backscattered electrons for 3D imaging with multi-detector method in VP/ESEM.",
        "https://doi.org/10.1016/j.mssp.2018.07.025"
    ),
    Pub(
        2018,
        listOf("Michał Mazur", "Jarosław Domaradzki", "Damian Wojcieszak", "Danuta Kaczmarek"),
        "Investigations of elemental composition and structure evolution in (Ti,Cu)-oxide gradient thin films prepared using (multi)magnetron co-sputtering.",
        "https://doi.org/10.1016/j.apsusc.2016.01.232"
    ),
    Pub(
        2017,
        listOf("Damian Wojcieszak", "Michał Mazur", "Danuta Kaczmarek", "Agata Poniedziałek", "Małgorzata Osękowska"),
        "An impact of the copper additive on photocatalytic and bactericidal properties of TiO₂ thin films.",
        "https://doi.org/10.3390/coatings11030300"
    ),
    Pub(
        2017,
        listOf(
            "Michał Mazur",
            "Agata Poniedziałek",
            "Danuta Kaczmarek",
            "Damian Wojcieszak",
            "Jarosław Domaradzki",
            "Des Gibson"
        ),
        "Investigation of various properties of HfO₂-TiO₂ thin film composites deposited by multi-magnetron sputtering system.",
        "https://doi.org/10.1016/j.apsusc.2016.12.129"
    ),
    Pub(
        2017,
        listOf(
            "Damian Wojcieszak",
            "Michał Mazur",
            "Des Gibson",
            "Grzegorz Zatryb",
            "Danuta Kaczmarek",
            "Jan Misiewicz"
        ),
        "Influence of europium on structure modification of TiO₂ thin films prepared by high energy magnetron sputtering process.",
        "https://doi.org/10.1016/j.surfcoat.2017.01.086"
    ),
    Pub(
        2017,
        listOf(
            "Michał Mazur",
            "Torsten Howind",
            "Des Gibson",
            "Danuta Kaczmarek",
            "Jerzy Morgiel",
            "Damian Wojcieszak",
            "Wenzhong Zhu",
            "Piotr Mazur"
        ),
        "Modification of various properties of HfO₂ thin films obtained by changing magnetron sputtering conditions.",
        "https://doi.org/10.1016/j.surfcoat.2016.12.001"
    ),
    Pub(
        2016,
        listOf(
            "Damian Wojcieszak",
            "Michał Mazur",
            "Danuta Kaczmarek",
            "Agata Poniedziałek",
            "Piotr Domanowski",
            "Bogumiła Szponar",
            "Aleksandra Czajkowska",
            "Andrzej Gamian"
        ),
        "Effect of the structure on biological and photocatalytic activity of transparent titania thin-film coatings.",
        "https://doi.org/10.15199/48.2019.09.22"
    ),
    Pub(
        2016,
        listOf(
            "Jarosław Domaradzki",
            "Danuta Kaczmarek",
            "Michał Mazur",
            "Damian Wojcieszak",
            "Jarosław Halarewicz",
            "Stanisław Głodek",
            "Piotr Domanowski"
        ),
        "Investigations of optical and surface properties of Ag single thin film coatings as semitransparent heat reflective mirror.",
        "https://doi.org/10.15199/48.2019.09.22"
    ),
    Pub(
        2016,
        listOf(
            "Michał Mazur",
            "Małgorzata Kalisz",
            "Jarosław Domaradzki",
            "Marcin Grobelny",
            "Damian Wojcieszak",
            "Danuta Kaczmarek",
            "Agata Poniedziałek"
        ),
        "Comparison of structural, mechanical and corrosion properties of (Ti₀.68W₀.32)Ox and (Ti₀.41W₀.59)Ox thin films, deposited on TiAlV surface by electron beam evaporation.",
        "https://doi.org/10.1016/j.surfcoat.2016.09.047"
    ),
    Pub(
        2015,
        listOf(
            "Damian Wojcieszak",
            "Michał Mazur",
            "Joanna Indyka",
            "Aleksandra Jurkowska",
            "Małgorzata Kalisz",
            "Piotr Domanowski",
            "Danuta Kaczmarek",
            "Jarosław Domaradzki"
        ),
        "Mechanical and structural properties of titanium dioxide deposited by innovative magnetron sputtering process.",
        "https://doi.org/10.1016/j.materresbull.2015.07.011"
    ),
    Pub(
        2015,
        listOf(
            "Michał Mazur",
            "Howind Torsten",
            "Gibson Des",
            "Kaczmarek Danuta",
            "Song Shigeng",
            "Wojcieszak Damian",
            "Wenzhong Zhu",
            "Mazur Piotr",
            "Domaradzki Jarosław",
            "Placido Frank"
        ),
        "Investigation of structural, optical and micro-mechanical properties of (NdₓTi₁₋ₓ)Ox thin films deposited by magnetron sputtering.",
        "https://doi.org/10.1016/j.matdes.2015.07.005"
    ),
    Pub(
        2015,
        listOf(
            "Michał Mazur",
            "Wojcieszak Damian",
            "Domaradzki Jarosław",
            "Kaczmarek Danuta",
            "Poniedziałek Agata",
            "Domanowski Piotr"
        ),
        "Investigation of microstructure, micro-mechanical and optical properties of HfTiO₄ thin films prepared by magnetron co-sputtering.",
        "https://doi.org/10.1016/j.materresbull.2015.07.011"
    ),
    Pub(
        2015,
        listOf("Jarosław Domaradzki", "Michał Mazur", "Wojcieszak Damian", "Kaczmarek Danuta", "Jędrzejak Tomasz"),
        "Investigation of optical response of gasochromic thin film structures through modelling of their transmission spectra under presence of organic vapor.",
        "https://doi.org/10.15199/48.2019.09.22"
    )
)
