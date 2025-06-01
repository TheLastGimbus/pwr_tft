package pwr.soszynski.mateusz.tft.ui

val tftHtml = """
<!DOCTYPE html>
<html lang="pl"><head>
    <!--[if IE]>
        <script src="/themes/_system/js/jquery-1.12.3.min.js"></script>
    <![endif]-->
    <title>Aktualności / Zespół Technologii Cienkowarstwowych</title>    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, height=device-height, initial-scale=1">
<meta http-equiv="x-ua-compatible" content="IE=Edge">
<meta name="robots" content="index,all,follow">
<meta property="og:url" content="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/iqrf-meet-up-rozwoj-technologii-komunikacji-bezprzewodowej-51.html">
<meta property="og:title" content="IQRF Meet-up – rozwój technologii komunikacji bezprzewodowej">
<meta property="og:description" content="">
<meta property="og:type" content="website">
<meta property="twitter:card" content="summary_large_image">
<meta property="twitter:site" content="@pwr_wroclaw">
<meta property="twitter:title" content="IQRF Meet-up – rozwój technologii komunikacji bezprzewodowej">
<meta property="twitter:description" content="">
<meta property="og:image" content="https://tft.pwr.edu.pl/thumb/FUQBLFBRVEAVjbwMwCRdCAkQCLCEhDAoHNndRA1JaS3xOBU0UBU0QBmYCR2pePABNXgIWLw,271/pl/news/26/51/2/0DVRXPBwBfwctBkRo,whatsapp_image_2024-11-27_at_132326_1.jpeg">
<meta property="twitter:image" content="https://tft.pwr.edu.pl/thumb/FUQBLFBRVEAVjbwMwCRdCAkQCLCEhDAoHNndRA1JaS3xOBU0UBU0QBmYCR2pePABNXgIWLw,271/pl/news/26/51/2/0DVRXPBwBfwctBkRo,whatsapp_image_2024-11-27_at_132326_1.jpeg">
<meta name="Keywords" content="">
<meta name="Description" content="">        <link rel="stylesheet" type="text/css" href="Aktualno%C5%9Bci%20_%20Zesp%C3%B3%C5%82%20Technologii%20Cienkowarstwowych_files/style.css">
<link rel="icon" type="image/x-icon" href="https://tft.pwr.edu.pl/favicon.ico">
<link rel="alternate" type="application/rss+xml" href="https://tft.pwr.edu.pl/rss/pl/26.xml">    <script src="Aktualno%C5%9Bci%20_%20Zesp%C3%B3%C5%82%20Technologii%20Cienkowarstwowych_files/jquery.min.js"></script>
<script src="Aktualno%C5%9Bci%20_%20Zesp%C3%B3%C5%82%20Technologii%20Cienkowarstwowych_files/script.js"></script>    <style type="text/css">
<!--@media screen and (max-width: 764px){.pwr-form .search-toggle.pwr-btn-submit{display:inline-block;}}
--></style>    <script>
var Lang = new Object();
var Link = new Object();
var Project = new Object();
Lang.openInNewTab = '(otwiera w nowej karcie)';
Project.theme = 'themes/standard2/';
</script>    <style>

    a {
        color: #0083ca;
    }

    .button-link {
        border-left: 4px solid #0083ca;
    }

    .button-link:hover {
        border-left: 4px solid #035e8f;
    }

    .button-link::before {
        border-left: 2px solid #0083ca;
    }

    .button-link:hover, .button-link:hover .ico, .button-link:hover span.text-campus {
        background-color: #035e8f;
    }

    .button-link:hover span.text, .button-link:hover span.text-campus {
        border-bottom: 2px solid #035e8f;
    }

    .button-link span.text {
        line-height: 1.2em;
        color: #0083ca;
    }

    .button-link .ico {
        border-bottom: 2px solid #035e8f;
        background-color: #0083ca;
        width: 50px;
        min-width: 50px;
        height: 50px;
    }

    .button-link .text-campus:after, .button-link .text-campus-title {
        color: #0083ca;
    }

    .pwr-form button.pwr-btn-submit:hover, .pwr-form input.pwr-btn-submit:hover {
        background: #0083ca;
        border: 1px solid #0083ca; 
    }

    input[type="submit"]:hover, input[type="button"]:hover, button:hover {
        background: #0083ca;
        border: 1px solid #0083ca; 
    }

    table th, table.red th, .button.red, table thead td {
        background-color: #0083ca;
        border: 1px solid #0083ca;
    }

    .pwr-table-pagination li a.current {
        background-color: #0083ca;
    }

    .pwr-table-pagination li a:hover {
        background-color: #0083ca;
        color: #fff;
    }

    .top-controls .login-controls a.active, .top-controls .language-controls a:hover, .top-controls .language-controls a.active {
        color: #0083ca;
    }

    .department-logo svg path {
        fill: #0083ca;
    }   

    .menu-button, .menu-button-back { 
        background-color: #0083ca;
        border-bottom: 2px solid #035e8f;
    }

    nav.menu a.main-dropdown.active, nav.menu a.main-dropdown.active:hover {
        background: #0083ca;
        border-bottom: 2px solid #035e8f;
    }

    .dropped-menu .dropped-menu-column .column-links a:hover {
        background-color: #0083ca;
        border-left: 4px solid #035e8f;
    }

    .dropped-menu .dropped-menu-column .column-links a:hover span {
        border-bottom: 2px dotted #0083ca;
    }

    .row.columns .side-menu .sub-menu li:last-child .current:hover span, .row.columns .side-menu li:last-child .current span, .row.columns .side-menu li:last-child a:hover span, .row.columns .side-menu li .current:hover span, .row.columns .side-menu li:last-child .sub-menu li a:hover span, .row.columns .side-menu li:last-child .sub-menu li a:hover span, .row.columns .side-menu a:hover span, .row.columns .side-menu a.current span, .row.columns .side-menu a.current:hover span, .row.columns .sub-menu li:last-child a:hover span {
        border-bottom: 2px dotted #0083ca;
    }

    .row.columns .side-menu a:hover, .row.columns .side-menu a.current, .row.columns .side-menu a.current:hover, .row.columns .side-menu .sub-menu a.current:hover {
        background-color: #0083ca;
        border-left: 4px solid #035e8f;
    }

    .row.columns .side-menu .sub-menu a.current, .row.columns .side-menu .sub-menu a.current i {
        color: #0083ca;
    }

    .slider-container-department .slide .container {
        background-color: #0083ca;
    }

    .pwr-fc .pwr-fc-grid .fc-d .fc-evnt {
        background: #0083ca;
    }


    .pwr-fc .pwr-fc-grid .fc-d.today {
        border: 1px solid #0083ca;
    }

    .owl-theme .owl-dots .owl-dot.active span{background:#0083ca;border:none;}

    .dictionary-record div:first-child {
        color: #0083ca; 
    }

    .job-content h3 {
        color: #0083ca;
    }

    table.study-calendar, table.study-calendar tr th {
        border: 2px solid #0083ca; 
    }

    table.study-calendar tr.weeks {
        border-top: 2px solid #0083ca;
        color: #0083ca;
    }

    table.study-calendar tr.weeks-p {
        color: #0083ca;
    }

    table.study-calendar tr td.day_of_week, table.study-calendar tr td.week_type {
        border-right: 2px solid #0083ca;
        color: #0083ca;
    }

    table.study-calendar tr td.day-first {
        border-top: 2px solid #0083ca;
    }

    table.study-calendar tr td.week-first {
        border-left: 2px solid #0083ca;
    }

    .swiper-controls i:hover { color: #0083ca; }
    .slider-container-medium .slide a, .slider-container-medium .slide p, .slider-container-medium .slide a span, .slider-container-medium .slide p span {
        color: #0083ca;
    }

    .select2-container--default .select2-results__option--highlighted[aria-selected] {
        background-color: #0083ca;
        border-top: 2px dotted #0083ca;
    }

    .accordion-title:after {
        color: #0083ca; 
    }
    
    .footer {
        background-color: #0083ca;
    }
    
    .credits {
        background-color: #035e8f;
    }
    
    .list-box {
        background-color: #0083ca;
    }

    .list-box.big {
        background-color: #035e8f;
    }

    @media screen and (max-width: 764px) {

        .main-menu a.main-dropdown.dropdown i, .dropped-menu .dropped-menu-column .title i {
            border-left: 2px solid #035e8f;
        }

        .pwr-form div.pwr-btn-submit:hover {
            background: #0083ca;
            border: 1px solid #0083ca; 
        }

        table.study-calendar tr th {
            border-bottom: 2px solid #0083ca;
        }

        nav.menu a.main-dropdown {
            background: #0083ca;
            border-color: #035e8f;
        }

        nav.menu a.main-dropdown:hover, nav.menu a.main-dropdown.active:hover {
            background: #035e8f;
            border-color: #035e8f;
        }

        .menu-button:hover, .menu-button-back:hover { background-color: #035e8f; }

        .dropped-menu {
            background: #0083ca;
        }

        .dropped-menu .dropped-menu-column .title, .dropped-menu .dropped-menu-column .column-links a {
            border-bottom: 2px solid #035e8f;
            background-color: #0083ca;
        }

        .dropped-menu .dropped-menu-column a:hover .title, .dropped-menu .dropped-menu-column .column-links a:hover {
            background-color: #035e8f;
            border-left: 0!important;
        }
    }
</style>    <!--[if IE]>
        <script src="/themes/_system/js/html5shiv.js"></script>
        <script src="/themes/_system/js/respond.js"></script>
    <![endif]-->
    <style>
    @font-face {
      font-style: normal;
      font-weight: 400;
      font-family: 'Metropolis';
      src: url(moz-extension://db644703-8fe6-4db0-bda3-c57ec3a537dd/assets/fonts/Metropolis-Regular.otf) format('opentype');
    }
    @font-face {
      font-style: normal;
      font-weight: 500;
      font-family: 'Metropolis';
      src: url(moz-extension://db644703-8fe6-4db0-bda3-c57ec3a537dd/assets/fonts/Metropolis-Medium.otf) format('opentype');
    }
    @font-face {
      font-style: normal;
      font-weight: 600;
      font-family: 'Metropolis';
      src: url(moz-extension://db644703-8fe6-4db0-bda3-c57ec3a537dd/assets/fonts/Metropolis-Semibold.otf) format('opentype');
    }
    @font-face {
      font-style: normal;
      font-weight: 700;
      font-family: 'Metropolis';
      src: url(moz-extension://db644703-8fe6-4db0-bda3-c57ec3a537dd/assets/fonts/Metropolis-Bold.otf) format('opentype');
    }
    @font-face {
      font-style: normal;
      font-weight: 400;
      src: url(moz-extension://db644703-8fe6-4db0-bda3-c57ec3a537dd/assets/fonts/CircularStd.otf) format('opentype');
      font-family: 'CircularStd';
    }
    @font-face {
      font-style: normal;
      font-weight: 300;
      src: url(moz-extension://db644703-8fe6-4db0-bda3-c57ec3a537dd/assets/fonts/CircularStdLight.otf) format('opentype');
      font-family: 'CircularStd';
    }
  </style></head>
<body style="overflow: auto;">
    
    <div class="verify_browser" id="verify_browser">
    <div class="container">
        <div class="row columns">
            <div class="column-content text-content">
                <div class="message warning">
                    <p style="font-size: 1.7em;"><strong>TWOJA PRZEGLĄDARKA JEST NIEAKTUALNA.</strong></p>
<p style="text-align: justify;">Wykryliśmy, że używasz nieaktualnej 
przeglądarki, przez co nasz serwis może dla Ciebie działać niepoprawnie.
 Zalecamy aktualizację lub przejście na inną przeglądarkę.</p>                </div>
            </div>
        </div>
    </div>
</div>

<script>
    ${'$'}(document).ready(function () {

        var browser = '';
        var browserVersion = 0;
        var browserInfo = ${'$'}("#verify_browser");

        if (/Opera[\/\s](\d+\.\d+)/.test(navigator.userAgent)) {
            browser = 'Opera';
        } else if (/Opera Mini[\/\s](\d+\.\d+);/.test(navigator.userAgent)) {
            browser = 'Opera Mini';
        } else if (/MSIE (\d+\.\d+);/.test(navigator.userAgent)) {
            browser = 'MSIE';
        } else if (/Trident[\/\s](\d+\.\d+);/.test(navigator.userAgent)) {
            browser = 'Trident';
        } else if (/Edge[\/\s](\d+\.\d+);/.test(navigator.userAgent)) {
            browser = 'Edge';
        } else if (/Navigator[\/\s](\d+\.\d+)/.test(navigator.userAgent)) {
            browser = 'Netscape';
        } else if (/Chrome[\/\s](\d+\.\d+)/.test(navigator.userAgent)) {
            browser = 'Chrome';
        } else if (/Android[\/\s](\d+\.\d+)/.test(navigator.userAgent)) {
            browser = 'Android';
            /Version[\/\s](\d+\.\d+)/.test(navigator.userAgent);
            browserVersion = new Number(RegExp.${'$'}1);
        } else if (/Safari[\/\s](\d+\.\d+)/.test(navigator.userAgent)) {
            browser = 'Safari';
            /Version[\/\s](\d+\.\d+)/.test(navigator.userAgent);
            browserVersion = new Number(RegExp.${'$'}1);
        } else if (/Firefox[\/\s](\d+\.\d+)/.test(navigator.userAgent)) {
            browser = 'Firefox';
        }

        if (browser == '') {
            browser = 'Unknown';
        } else if (browserVersion === 0) {
            browserVersion = parseFloat(new Number(RegExp.${'$'}1));
        }

        if (browser === 'Opera' && browserVersion < 18 && browserVersion !== 0) {
            browserInfo.show();
        } else if (browser === 'MSIE' && browserVersion < 9 && browserVersion !== 0) {
            browserInfo.show();
        } else if (browser === 'Chrome' && browserVersion < 31 && browserVersion !== 0) {
            browserInfo.show();
        } else if (browser === 'Firefox' && browserVersion < 23 && browserVersion !== 0) {
            browserInfo.show();
        } else if (browser === 'Opera Mini' && browserVersion < 7 && browserVersion !== 0) {
            browserInfo.show();
        } else if (browser === 'Android' && browserVersion < 4 && browserVersion !== 0) {
            browserInfo.show();
        }

    });
</script>
    <div class="top-controls">
    <div class="container">
        <div class="controls-container">
            
            
            <div class="font-controls">
                <a href="javascript:void(0)" class="normal" title="Normalna">A</a>
                <a href="javascript:void(0)" class="bigger" title="Większa">A<sup>+</sup></a>
                <a href="javascript:void(0)" class="biggest" title="Największa">A<sup>++</sup></a>
            </div>

            <div class="style-controls">
                <a href="javascript:void(0)" title="Normalna" class="classic" data-style="style">A</a>
                <a href="javascript:void(0)" title="Normalna" class="black" data-style="style-b">A</a>
                <a href="javascript:void(0)" title="Normalna" class="yellow" data-style="style-y">A</a>
                <a href="javascript:void(0)" title="Normalna" class="black-yellow" data-style="style-by">A</a>
                <div class="clear"></div>
            </div>

                            <div class="language-controls">
                                            <a class="active" title="Polski" href="https://tft.pwr.edu.pl/"><span class="hidden">Polski</span>pl</a>
                                                    <span>•</span>
                                                                    <a title="English" href="https://tft.pwr.edu.pl/en/"><span class="hidden">English</span>en</a>
                                                            </div>
            
            <div class="login-controls">
                                                            <a href="https://tft.pwr.edu.pl/keycloak/login/front?redirect=/strona-glowna/aktualnosci" title="Logowanie">
                            Logowanie                        </a>
                                                </div>
            <div class="clear"></div>
        </div>
        <div class="clear"></div>
    </div>
</div>  
        <div class="container">
                <header class="top">
                        <div class="global-event">
                <h1 class="logo" title="Strona główna">
                    <a href="https://pwr.edu.pl/pl/" class="logo" title="Strona główna">
                        <svg xmlns:dc="http://purl.org/dc/elements/1.1/" xmlns:cc="http://creativecommons.org/ns#" xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#" xmlns:svg="http://www.w3.org/2000/svg" xmlns="http://www.w3.org/2000/svg" xlink="http://www.w3.org/1999/xlink" xmlns:sodipodi="http://sodipodi.sourceforge.net/DTD/sodipodi-0.dtd" xmlns:inkscape="http://www.inkscape.org/namespaces/inkscape" version="1.1" id="Warstwa_1" x="0px" y="0px" width="700px" height="164px" viewBox="0 0 700 164" enable-background="new 0 0 700 164" xml:space="preserve" sodipodi:docname="w12n.svg" inkscape:version="1.0.2-2 (e86c870879, 2021-01-15)"><metadata id="metadata113"><rdf:rdf><cc:work rdf:about=""><dc:format>image/svg+xml</dc:format><dc:type rdf:resource="http://purl.org/dc/dcmitype/StillImage"></dc:type></cc:work></rdf:rdf></metadata><defs id="defs111"></defs><sodipodi:namedview pagecolor="#ffffff" bordercolor="#666666" borderopacity="1" objecttolerance="10" gridtolerance="10" guidetolerance="10" inkscape:pageopacity="0" inkscape:pageshadow="2" inkscape:window-width="1920" inkscape:window-height="1137" id="namedview109" showgrid="false" showguides="true" inkscape:guide-bbox="true" inkscape:zoom="1.8528571" inkscape:cx="503.54665" inkscape:cy="82" inkscape:window-x="-8" inkscape:window-y="-8" inkscape:window-maximized="1" inkscape:current-layer="g106"><sodipodi:guide position="150.03855,153.20586" orientation="1,0" id="guide1133"></sodipodi:guide><sodipodi:guide position="116.57672,28.533539" orientation="0,-1" id="guide1135"></sodipodi:guide></sodipodi:namedview>
<g id="g106">
	<g id="g10">
		<defs id="defs3">
			<rect id="SVGID_1_" x="-0.64" width="699.881" height="200.007"></rect>
		</defs>
		<clipPath id="SVGID_2_">
			<use xlink:href="#SVGID_1_" overflow="visible" id="use5"></use>
		</clipPath>
		<polygon clip-path="url(#SVGID_2_)" points="-0.76,0 125.86,0 125.86,126.646 -0.76,126.646 -0.76,0   " id="polygon8"></polygon>
	</g>
	<path d="M170.28,92.049c0-4.754-3.387-7.573-9.632-7.573c-2.639,0-5.014,0.31-7.168,0.31c-0.616,0-1.276-0.043-2.112-0.131   c0.177,4.574,0.264,9.459,0.264,14.74c0,5.013-0.087,9.895-0.264,14.654c0.748-0.14,1.452-0.227,2.155-0.227   c0.617,0,1.188,0.087,1.803,0.175c-0.175-3.08-0.219-5.497-0.219-7.26v-6.156c1.363,0.087,2.507,0.087,3.255,0.087   C166.146,100.668,170.28,97.5,170.28,92.049L170.28,92.049L170.28,92.049z M166.233,92.397c0,4.486-3.078,6.735-9.235,6.735   c-0.659,0-1.275-0.048-1.934-0.092v-3.872c0-3.12,0.087-6.071,0.219-8.843c0.924-0.088,1.803-0.131,2.683-0.131   C163.638,86.195,166.233,87.779,166.233,92.397L166.233,92.397L166.233,92.397z M191.127,103.88   c0-6.245-4.222-10.514-10.203-10.514c-5.806,0-10.205,4.269-10.205,10.514c0,6.291,4.267,10.563,10.205,10.563   C186.772,114.442,191.127,110.302,191.127,103.88L191.127,103.88L191.127,103.88z M187.433,104.146c0,5.889-2.287,8.97-6.509,8.97   c-4.267,0-6.554-3.168-6.554-9.28c0-6.069,2.287-9.195,6.509-9.195C185.146,94.641,187.433,97.897,187.433,104.146L187.433,104.146   L187.433,104.146z M199.395,114.049c-0.132-3.739-0.176-10.073-0.176-18.988c0-4.876,0-9.275,0.176-13.229   c-0.572,0.044-1.232,0.088-1.847,0.088c-0.527,0-1.144-0.044-1.715-0.088c0.176,2.373,0.176,5.14,0.176,8.396v11.29   c0,5.493,0,9.664-0.176,12.53c0.571-0.096,1.144-0.14,1.715-0.14C198.163,113.909,198.78,113.953,199.395,114.049L199.395,114.049   L199.395,114.049z M210.126,86.282c0-1.23-0.967-2.155-2.199-2.155c-1.187,0-2.198,0.925-2.198,2.155   c0,1.188,1.011,2.156,2.198,2.156C209.159,88.438,210.126,87.47,210.126,86.282L210.126,86.282L210.126,86.282z M209.687,114.049   c-0.132-3.528-0.221-7.098-0.221-10.658c0-3.298,0.089-6.476,0.221-9.645c-0.528,0.135-1.144,0.179-1.76,0.179   c-0.571,0-1.144-0.044-1.759-0.179c0.132,3.125,0.22,6.347,0.22,9.645c0,3.561-0.088,7.13-0.22,10.658   c0.615-0.14,1.188-0.227,1.759-0.227C208.543,113.822,209.159,113.909,209.687,114.049L209.687,114.049L209.687,114.049z    M226.399,113.028l-0.307-0.969c-1.232,0.615-2.244,0.926-2.991,0.926c-2.727,0-3.607-1.671-3.607-5.462   c0-3.914,0.176-7.222,0.176-9.949c0-0.218,0.044-0.969,0.088-2.156c0.44-0.044,0.968-0.044,1.54-0.044   c1.099,0,2.418,0.044,3.958,0.136v-0.354c0-0.528,0.044-1.013,0.131-1.41c-2.154,0.179-4.001,0.223-5.585,0.223v-2.811   c0-0.441,0.045-1.541,0.132-3.379c-1.011,0.48-2.156,0.834-3.474,1.057c0.043,1.135,0.087,2.322,0.087,3.592v1.453   c-0.879,0-1.846-0.048-2.726-0.135c0,0.179,0.044,0.397,0.044,0.659c0,0.354-0.044,0.751-0.088,1.147   c0.748-0.091,1.495-0.135,2.242-0.135h0.441v1.453c0,5.639-0.22,9.552-0.22,11.707c0,4.053,1.495,5.907,5.497,5.907   C223.364,114.485,224.991,113.953,226.399,113.028L226.399,113.028L226.399,113.028z M245.751,102.693   c0-6.027-3.211-9.37-8.664-9.37c-5.982,0-9.896,4.225-9.896,10.6c0,6.204,4.091,10.52,10.159,10.52c2.64,0,5.059-0.843,7.301-2.471   v-0.526c0-0.485,0.044-1.057,0.089-1.628c-2.024,1.98-4.135,2.9-6.642,2.9c-4.663,0-7.213-3.119-7.213-8.969v-0.131h14.822   C245.707,103.308,245.751,103.002,245.751,102.693L245.751,102.693L245.751,102.693z M242.277,102.121h-11.303   c0.174-4.621,2.726-7.48,5.937-7.48c3.298,0,5.366,2.467,5.366,6.778V102.121L242.277,102.121z M266.553,95.082   c-2.242-1.144-4.574-1.716-6.992-1.716c-6.422,0-10.688,4.182-10.688,10.557c0,6.422,4.09,10.563,10.072,10.563   c3.034,0,5.41-0.663,7.344-2.159c-0.043-0.267-0.043-0.572-0.043-0.881c0-0.441,0.043-0.97,0.088-1.584   c-2.068,2.11-4.091,3.124-6.509,3.124c-4.442,0-7.477-3.431-7.477-9.105c0-5.852,2.682-9.151,7.213-9.151   c2.682,0,4.618,1.322,5.849,4.051C265.674,97.413,266.07,96.139,266.553,95.082L266.553,95.082L266.553,95.082z M287.532,114.049   c-0.087-2.866-0.176-5.064-0.176-6.604c0-2.553,0.132-4.751,0.132-6.598c0-4.975-2.287-7.48-6.86-7.48   c-2.859,0-4.839,1.188-6.686,3.916c0-2.069-0.044-4.047-0.044-5.889c0-2.763,0.044-5.972,0.132-9.562   c-0.528,0.088-1.143,0.174-1.759,0.174c-0.528,0-1.143-0.086-1.803-0.174c0.132,5.043,0.219,10.391,0.219,16.065   c0,2.994-0.044,8.359-0.219,16.151c0.571-0.14,1.143-0.227,1.716-0.227c0.615,0,1.231,0.087,1.803,0.227   c-0.045-2.338-0.089-4.014-0.089-5.021v-3.08c0-3.609,0.089-6.113,0.836-7.61c0.968-1.846,2.595-2.815,4.618-2.815   c3.65,0,4.882,2.244,4.882,7.084c0,2.856-0.088,6.683-0.221,11.442c0.617-0.14,1.188-0.227,1.76-0.227   C286.389,113.822,287.004,113.909,287.532,114.049L287.532,114.049L287.532,114.049z M310.974,114.049   c-0.089-2.43-0.133-4.672-0.133-6.784c0-2.02,0.09-4.132,0.09-6.242c0-5.15-2.289-7.699-6.861-7.699   c-2.903,0-5.102,1.361-6.729,4.177c0-0.524-0.044-1.057-0.044-1.58c0-0.707,0.044-1.41,0.087-2.156   c-0.528,0.131-1.099,0.175-1.715,0.175c-0.528,0-1.144-0.044-1.76-0.175c0.176,3.033,0.176,6.247,0.176,9.767v3.033   c0,2.596,0,5.056-0.176,7.485c0.616-0.14,1.188-0.227,1.76-0.227c0.616,0,1.231,0.087,1.802,0.227   c-0.087-2.208-0.087-4.847-0.087-8.058v-1.933c0-2.862,0.087-5.018,1.451-6.689c0.968-1.274,2.332-1.847,4.003-1.847   c3.254,0,4.882,2.112,4.882,6.338c0,5.1-0.088,9.188-0.264,12.188c0.615-0.14,1.186-0.227,1.758-0.227   C309.785,113.822,310.403,113.909,310.974,114.049L310.974,114.049L310.974,114.049z M321.704,86.282   c0-1.23-0.966-2.155-2.198-2.155c-1.187,0-2.199,0.925-2.199,2.155c0,1.188,1.012,2.156,2.199,2.156   C320.738,88.438,321.704,87.47,321.704,86.282L321.704,86.282L321.704,86.282z M321.266,114.049   c-0.133-3.528-0.22-7.098-0.22-10.658c0-3.298,0.087-6.476,0.22-9.645c-0.528,0.135-1.143,0.179-1.76,0.179   c-0.572,0-1.143-0.044-1.759-0.179c0.131,3.125,0.221,6.347,0.221,9.645c0,3.561-0.09,7.13-0.221,10.658   c0.616-0.14,1.187-0.227,1.759-0.227C320.123,113.822,320.738,113.909,321.266,114.049L321.266,114.049L321.266,114.049z    M345.63,114.049c-3.87-4.585-7.258-8.503-10.115-11.849l3.87-3.657c2.332-2.2,4.133-3.828,5.586-4.797   c-0.615,0.087-1.276,0.135-1.891,0.135c-0.615,0-1.233-0.048-1.891-0.135c-4.706,5.993-8.18,8.764-8.972,8.764   c-0.485,0-0.705-0.262-0.705-0.747v-1.451c0-5.378,0.044-11.516,0.22-18.479c-0.571,0.088-1.186,0.174-1.804,0.174   c-0.571,0-1.186-0.086-1.802-0.174c0.175,5.433,0.221,10.779,0.221,16.052c0,4.142-0.046,9.508-0.221,16.165   c0.616-0.14,1.231-0.227,1.802-0.227c0.618,0,1.233,0.087,1.804,0.227c-0.22-3.35-0.22-5.945-0.22-7.67v-2.417   c0-0.396,0-0.571,0.397-0.571c0.659,0,3.783,3.474,9.103,10.658c0.705-0.14,1.453-0.183,2.199-0.183   C344.003,113.866,344.838,113.909,345.63,114.049L345.63,114.049L345.63,114.049z M365.465,113.338l-0.176-0.838   c-0.266,0.044-0.527,0.044-0.746,0.044c-1.629,0-1.893-0.79-1.893-2.857V108.5l0.178-7.347v-0.528c0-4.885-1.893-7.215-6.773-7.215   c-2.684,0-5.102,0.834-6.951,2.418l-0.087,2.248h0.351c1.319-2.025,3.167-3.038,5.542-3.038c3.475,0,4.793,1.846,4.793,5.63v0.926   c-1.1,0.969-3.695,1.143-7.475,1.937c-3.388,0.747-5.015,2.548-5.015,5.629c0,3.341,2.111,5.283,5.937,5.283   c2.463,0,4.617-1.018,6.42-2.91c0.264,1.715,0.883,2.508,2.375,2.508C363.178,114.04,364.278,113.688,365.465,113.338   L365.465,113.338L365.465,113.338z M359.618,108.94c0,0.614-0.047,1.143-0.748,1.846c-1.145,1.143-2.904,1.889-4.313,1.889   c-2.375,0-3.826-1.492-3.826-4.088c0-3.386,2.684-4.18,8.887-5.191V108.94L359.618,108.94L359.618,108.94z M419.87,84.654   c-0.484,0.131-0.967,0.175-1.451,0.175s-0.924-0.044-1.363-0.175c-2.156,8.402-4.662,16.721-7.475,24.857   c-3.037-8.358-5.764-16.674-8.271-24.857c-0.482,0.131-0.967,0.175-1.406,0.175c-0.484,0-0.926-0.044-1.406-0.175   c-2.42,8.887-5.146,17.293-8.051,25.294c-2.813-8.708-5.275-17.153-7.475-25.294c-0.662,0.131-1.363,0.175-2.025,0.175   c-0.703,0-1.406-0.044-2.064-0.175c3.342,10.472,6.42,20.237,9.189,29.395c0.527-0.14,1.012-0.227,1.496-0.227   c0.529,0,1.012,0.087,1.494,0.227c1.277-3.528,3.916-11.53,8.049-24.025c2.947,8.184,5.631,16.186,7.918,24.069   c0.527-0.184,1.012-0.227,1.539-0.227c0.525,0,1.014,0.043,1.494,0.183C413.272,104.451,416.483,94.685,419.87,84.654   L419.87,84.654L419.87,84.654z M431.875,93.764c-0.703-0.136-1.23-0.223-1.627-0.223c-2.109,0-3.824,1.672-5.365,4.928   c0-1.759,0.088-3.343,0.221-4.705c-0.574,0.131-1.188,0.175-1.803,0.175c-0.572,0-1.189-0.044-1.848-0.175   c0.176,1.847,0.219,3.915,0.219,6.202c0,6.291-0.086,10.994-0.219,14.031c0.57-0.088,1.1-0.131,1.627-0.131   c0.615,0,1.275,0.043,1.891,0.183c-0.131-1.945-0.221-4.847-0.221-8.673c0-5.851,1.232-8.71,4.486-8.71   c0.703,0,1.365,0.175,2.066,0.572l0.355-0.218C431.659,95.784,431.702,94.641,431.875,93.764L431.875,93.764L431.875,93.764z    M454.307,103.88c0-6.245-4.221-10.514-10.205-10.514c-5.805,0-10.203,4.269-10.203,10.514c0,6.291,4.268,10.563,10.203,10.563   C449.954,114.442,454.307,110.302,454.307,103.88L454.307,103.88L454.307,103.88z M450.612,104.146c0,5.889-2.285,8.97-6.51,8.97   c-4.264,0-6.553-3.168-6.553-9.28c0-6.069,2.289-9.195,6.51-9.195C448.327,94.641,450.612,97.897,450.612,104.146L450.612,104.146   L450.612,104.146z M474.977,95.082c-2.242-1.144-4.574-1.716-6.994-1.716c-6.418,0-10.686,4.182-10.686,10.557   c0,6.422,4.09,10.563,10.072,10.563c3.033,0,5.408-0.663,7.344-2.159c-0.043-0.267-0.043-0.572-0.043-0.881   c0-0.441,0.043-0.97,0.088-1.584c-2.068,2.11-4.092,3.124-6.51,3.124c-4.441,0-7.477-3.431-7.477-9.105   c0-5.852,2.684-9.151,7.211-9.151c2.684,0,4.619,1.322,5.852,4.051C474.098,97.413,474.495,96.139,474.977,95.082L474.977,95.082   L474.977,95.082z M485.577,92.816v-2.283c-0.615,0.529-1.627,1.401-3.123,2.457v-0.483c0-4.081,0.09-7.948,0.221-10.675   c-0.572,0.044-1.232,0.088-1.848,0.088c-0.527,0-1.145-0.044-1.715-0.088c0.176,3.556,0.221,7.602,0.221,12.172v1.144   c-1.277,0.882-1.672,1.144-2.992,1.938v2.234c1.846-1.497,2.771-2.278,2.947-2.371v6.241c0,4.741-0.088,8.342-0.176,10.858   c0.57-0.096,1.143-0.14,1.715-0.14c0.615,0,1.232,0.044,1.848,0.14c-0.131-2.734-0.221-8.93-0.221-19.251   C483.772,93.96,484.127,93.693,485.577,92.816L485.577,92.816L485.577,92.816z M505.85,113.338l-0.174-0.838   c-0.264,0.044-0.527,0.044-0.748,0.044c-1.627,0-1.891-0.79-1.891-2.857V108.5l0.176-7.347v-0.528c0-4.885-1.891-7.215-6.773-7.215   c-2.682,0-5.102,0.834-6.949,2.418l-0.088,2.248h0.352c1.32-2.025,3.168-3.038,5.543-3.038c3.473,0,4.793,1.846,4.793,5.63v0.926   c-1.1,0.969-3.695,1.143-7.477,1.937c-3.387,0.747-5.016,2.548-5.016,5.629c0,3.341,2.113,5.283,5.939,5.283   c2.463,0,4.617-1.018,6.42-2.91c0.266,1.715,0.881,2.508,2.377,2.508C503.565,114.04,504.665,113.688,505.85,113.338   L505.85,113.338L505.85,113.338z M500.002,108.94c0,0.614-0.045,1.143-0.748,1.846c-1.143,1.143-2.904,1.889-4.311,1.889   c-2.373,0-3.826-1.492-3.826-4.088c0-3.386,2.684-4.18,8.885-5.191V108.94L500.002,108.94L500.002,108.94z M538.44,93.746   c-0.393,0.044-0.834,0.087-1.273,0.087s-0.836-0.043-1.318-0.087c-2.684,7.882-4.752,13.118-5.982,15.674   c-1.363-2.773-3.301-8.01-5.365-15.674c-0.441,0.087-0.879,0.135-1.277,0.135c-0.395,0-0.836-0.048-1.273-0.135   c-1.627,5.731-3.475,10.962-5.631,15.718c-2.859-7.351-4.617-12.593-5.365-15.718c-0.66,0.135-1.32,0.179-1.936,0.179   c-0.66,0-1.275-0.044-1.891-0.179c4.133,10.037,6.643,16.822,7.477,20.303c0.439-0.096,0.793-0.096,1.23-0.096   c0.398,0,0.836,0,1.232,0.096c0.879-3.704,2.639-8.899,5.41-15.549c3.299,8.804,5.014,13.957,5.277,15.549   c0.438-0.096,0.836-0.14,1.232-0.14c0.439,0,0.879,0.044,1.318,0.14C531.36,110.035,534.217,103.347,538.44,93.746L538.44,93.746   L538.44,93.746z M552.735,107.662c0-2.683-1.318-4.088-4.135-4.926l-2.947-0.876c-2.197-0.664-3.252-1.629-3.252-3.609   c0-2.156,1.494-3.61,3.648-3.61c1.715,0,3.342,0.97,4.971,2.859c0.176-0.921,0.482-1.803,0.924-2.729   c-1.453-0.877-3.299-1.405-5.365-1.405c-4.047,0-6.598,2.506-6.598,5.941c0,3.031,1.406,4.615,4.662,5.54l1.979,0.571   c2.289,0.616,3.387,1.497,3.387,3.521c0,2.417-1.627,3.914-4.178,3.914c-2.066,0-3.826-1.101-5.234-3.3   c-0.264,1.101-0.615,2.199-1.055,3.343c1.496,1.012,3.43,1.545,5.586,1.545C549.702,114.442,552.735,111.488,552.735,107.662   L552.735,107.662L552.735,107.662z M574.594,114.049c-3.871-4.585-7.258-8.503-10.117-11.849l3.871-3.657   c2.332-2.2,4.133-3.828,5.586-4.797c-0.617,0.087-1.275,0.135-1.891,0.135c-0.617,0-1.232-0.048-1.893-0.135   c-4.707,5.993-8.18,8.764-8.971,8.764c-0.484,0-0.705-0.262-0.705-0.747v-1.451c0-5.378,0.043-11.516,0.221-18.479   c-0.572,0.088-1.188,0.174-1.805,0.174c-0.572,0-1.186-0.086-1.801-0.174c0.174,5.433,0.219,10.779,0.219,16.052   c0,4.142-0.045,9.508-0.219,16.165c0.615-0.14,1.229-0.227,1.801-0.227c0.617,0,1.232,0.087,1.805,0.227   c-0.221-3.35-0.221-5.945-0.221-7.67v-2.417c0-0.396,0-0.571,0.396-0.571c0.66,0,3.783,3.474,9.104,10.658   c0.705-0.14,1.451-0.183,2.199-0.183C572.965,113.866,573.801,113.909,574.594,114.049L574.594,114.049L574.594,114.049z    M594.428,113.338l-0.176-0.838c-0.266,0.044-0.529,0.044-0.746,0.044c-1.627,0-1.891-0.79-1.891-2.857V108.5l0.174-7.347v-0.528   c0-4.885-1.893-7.215-6.773-7.215c-2.684,0-5.1,0.834-6.947,2.418l-0.088,2.248h0.352c1.318-2.025,3.166-3.038,5.541-3.038   c3.475,0,4.795,1.846,4.795,5.63v0.926c-1.102,0.969-3.695,1.143-7.479,1.937c-3.385,0.747-5.014,2.548-5.014,5.629   c0,3.341,2.113,5.283,5.939,5.283c2.463,0,4.617-1.018,6.42-2.91c0.264,1.715,0.881,2.508,2.375,2.508   C592.141,114.04,593.243,113.688,594.428,113.338L594.428,113.338L594.428,113.338z M588.579,108.94   c0,0.614-0.043,1.143-0.746,1.846c-1.145,1.143-2.904,1.889-4.311,1.889c-2.377,0-3.826-1.492-3.826-4.088   c0-3.386,2.684-4.18,8.883-5.191V108.94L588.579,108.94L588.579,108.94z" id="path12"></path>
	<path fill="#FFFFFF" d="M44.152,40.417c0.287,14.414,7.228,25.617,21.536,26.525l0.001-4.039   c-11.582-0.371-20.241-11.799-21.3-22.486H44.152L44.152,40.417L44.152,40.417z M41.849,42.719c-0.792,0-1.438-0.682-1.438-1.519   c0-0.837,0.646-1.521,1.438-1.521c0.792,0,1.437,0.683,1.437,1.521C43.286,42.037,42.641,42.719,41.849,42.719L41.849,42.719   L41.849,42.719z M46.726,42.283c-0.791,0-1.438-0.683-1.438-1.521c0-0.837,0.646-1.521,1.438-1.521   c0.792,0,1.438,0.683,1.438,1.521C48.163,41.601,47.518,42.283,46.726,42.283L46.726,42.283L46.726,42.283z M44.084,39.611   c-0.792,0-1.438-0.684-1.438-1.52c0-0.837,0.647-1.522,1.438-1.522c0.791,0,1.438,0.685,1.438,1.522   C45.522,38.927,44.875,39.611,44.084,39.611L44.084,39.611L44.084,39.611z M65.675,113.979h-0.023   c-0.978-2.3-1.567-4.464-1.853-6.143c-0.215-1.257-0.286-2.369-0.277-3.347c0.006-0.978,0.096-1.832,0.188-2.587   c0.18-1.51,0.393-2.631,0.065-3.591c-0.468-0.271-3.039,2.972-4.753,3.237c-2.85,0.445-3.152-1.702-5.249-2.505   c1.538-0.585,2.682-0.463,4.026-1.156c1.164-0.603,1.98-1.829,3.269-2.2c0.89-0.258,1.925-0.157,3.026,0.419   c0.388,0,0.094-0.781-0.243-1.812c-0.262-0.799-0.641-1.776-0.659-2.623c-0.016-0.756,0.271-1.401,0.902-1.816   c-0.64-1.1-1.042-2.204-1.1-3.007c-0.132-1.842,0.474-2.806,0.399-4.123c-0.054-0.943-0.035-2.313-0.394-2.828   c-1.385,0.528-3.678,8.352-3.86,9.822l-2.013-1.218l-1.252,2.195c-0.476,0.834,1.928,3.326-0.644,4.671l-0.095-0.057   c0.242-0.742,0.254-1.397-0.317-2.147c-0.965-1.262-2.279-0.363-4.146-1.628c-0.963-1.101-2.249-1.196-3.09-0.848   c-0.581,0.24-1.021,0.703-1.071,1.576l-0.115,0.048c-0.548-1.239-0.059-2.213,0.703-2.824c1.891-1.511,6.541,0.877,7.055,0   l1.165-1.981l-1.994-1.257c5.025-3.591,5.049-9.743,4.665-15.349l-0.32-0.161c-0.822,5.161-3.072,9.048-6.647,11.802   c-1.345,1.034-3.008,1.99-4.847,0.431c2.209-1.482,4.407-4.567,5.131-7.159c0.709-2.539,1.015-5.492,0.909-8.778l-0.262-0.222   c-0.999,5.737-4.117,8.665-6.207,10.178c-1.479,1.073-3.258,2.046-4.889,0.576c2.402-1.963,4.265-4.546,5.228-7.246   c1.006-2.819,1.335-5.932,1.069-9.068l-0.23-0.301c-1.252,5.351-2.568,8-5.629,10.329c-1.539,1.174-3.304,1.85-5.05,0.275   c3.18-2.43,4.487-4.59,5.386-8.3C42.52,59.59,43.054,56.45,43,52.343L42.767,51.5c-1.209,6.819-3.088,11.061-5.289,12.94   c-1.487,1.267-3.419,2.209-4.574,0.84c1.471-1.687,2.401-3.522,2.896-5.511c1.011-4.059,0.794-7.443,0.716-12.884   c-0.05-3.552,0.333-6.941,2-9.949c1.71-3.089,5.518-3.862,8.29-3.055c4.514,1.364,5.678,6.718,3.547,10.035   c-1.126,1.753-0.95,3.999-0.351,5.103c0.735,1.354,2.259,2.748,3.741,3.946c1.338,1.081,5.153,3.724,7.525,3.341   c-0.11-1.388,0.267-2.905,0.727-4.448c0.461-1.539,1.01-3.109,1.245-4.597c0.211-1.352,0.036-2.945-0.656-3.864   c-0.802-0.813-1.619-1.205-2.425-1.485c-1.036-0.361-1.642-0.529-2.252-1.358c-0.319-0.435-0.425-1.254-0.494-2.139   c0.545,0.596,0.975,1.001,1.464,1.255c0.442,0.229,1.732,0.597,2.132,0.136c-0.423-0.937-1.197-1.737-2.126-2.192   c-1.239-0.605-2.413-0.358-3.325,0.618c-0.259-0.975-0.1-2.146,0.685-2.864c0.818-0.747,2.518-0.478,3.421,0.005   c-0.113-0.714,0.265-1.4,1.288-1.505c0.702-0.071,1.416,0.131,2.078,0.319c0.994,0.283,1.743,0.715,2.667,1.208L65.675,113.979   L65.675,113.979z M60.379,35.744c0.337,0.165,0.664,0.439,0.921,0.726c0.376,0.455,1.591,0.228,2.283,0.437   c0.422,0.126,0.621,0.303,0.649,0.225c-0.209-0.43-0.357-0.861-0.709-1.195C62.756,35.208,60.441,34.696,60.379,35.744   L60.379,35.744L60.379,35.744z M87.242,40.417c-0.287,14.414-7.229,25.617-21.536,26.525l-0.001-4.038   c11.582-0.371,20.242-11.8,21.3-22.487H87.242L87.242,40.417L87.242,40.417z M89.545,42.719c0.792,0,1.438-0.681,1.438-1.519   c0-0.837-0.646-1.521-1.438-1.521c-0.791,0-1.437,0.683-1.437,1.521C88.108,42.038,88.754,42.719,89.545,42.719L89.545,42.719   L89.545,42.719z M84.668,42.283c0.791,0,1.438-0.683,1.438-1.521c0-0.836-0.647-1.521-1.438-1.521   c-0.792,0-1.438,0.684-1.438,1.521C83.231,41.601,83.877,42.283,84.668,42.283L84.668,42.283L84.668,42.283z M87.308,39.611   c0.794,0,1.438-0.684,1.438-1.52c0-0.837-0.645-1.521-1.438-1.521c-0.791,0-1.437,0.684-1.437,1.521   C85.872,38.927,86.517,39.611,87.308,39.611L87.308,39.611L87.308,39.611z M104.819,29.99c-0.32,17.26-0.603,71.128-39.075,83.989   h-0.025c0.98-2.304,1.589-4.458,1.877-6.143c0.214-1.257,0.285-2.369,0.276-3.347c-0.007-0.978-0.096-1.832-0.188-2.587   c-0.181-1.51-0.393-2.631-0.065-3.591c0.468-0.271,3.04,2.972,4.753,3.237c2.85,0.445,3.153-1.702,5.25-2.505   c-1.538-0.585-2.683-0.463-4.027-1.156c-1.164-0.603-1.98-1.829-3.269-2.2c-0.89-0.258-1.924-0.157-3.026,0.419   c-0.387,0-0.094-0.781,0.243-1.812c0.262-0.794,0.641-1.776,0.659-2.623c0.016-0.756-0.271-1.401-0.902-1.812   c0.64-1.104,1.042-2.209,1.099-3.012c0.132-1.842-0.473-2.806-0.399-4.123c0.053-0.943,0.034-2.309,0.395-2.828   c1.384,0.528,3.676,8.352,3.86,9.822l2.012-1.218l1.252,2.195c0.476,0.834-1.928,3.326,0.644,4.671l0.095-0.057   c-0.242-0.738-0.254-1.397,0.317-2.147c0.964-1.262,2.279-0.363,4.146-1.628c0.962-1.101,2.248-1.196,3.09-0.848   c0.58,0.24,1.022,0.703,1.071,1.576l0.113,0.048c0.551-1.239,0.06-2.213-0.701-2.824c-1.891-1.506-6.541,0.877-7.055,0   l-1.165-1.981l1.994-1.257c-5.024-3.591-5.05-9.738-4.665-15.349l0.321-0.161c0.821,5.161,3.071,9.048,6.648,11.802   c1.343,1.034,3.007,1.99,4.846,0.431c-2.21-1.482-4.408-4.567-5.132-7.159c-0.709-2.539-1.014-5.492-0.908-8.778l0.262-0.222   c0.999,5.737,4.117,8.665,6.207,10.178c1.479,1.073,3.258,2.046,4.889,0.576c-2.402-1.963-4.266-4.546-5.228-7.246   c-1.005-2.819-1.335-5.929-1.068-9.068l0.229-0.301c1.252,5.351,2.568,8,5.629,10.329c1.539,1.174,3.304,1.85,5.05,0.275   c-3.179-2.43-4.487-4.59-5.385-8.3c-0.888-3.667-1.423-6.807-1.37-10.914l0.234-0.843c1.208,6.819,3.086,11.061,5.288,12.939   c1.487,1.267,3.42,2.209,4.575,0.84c-1.472-1.687-2.403-3.522-2.898-5.51c-1.011-4.06-0.793-7.444-0.715-12.885   c0.051-3.552-0.333-6.94-2-9.948c-1.71-3.089-5.519-3.863-8.289-3.056c-4.514,1.364-5.678,6.718-3.547,10.035   c1.125,1.754,0.95,4,0.35,5.103c-0.735,1.354-2.258,2.748-3.74,3.946c-1.338,1.081-5.153,3.724-7.525,3.342   c0.11-1.389-0.265-2.906-0.727-4.448c-0.461-1.54-1.01-3.109-1.244-4.597c-0.212-1.353-0.037-2.946,0.655-3.865   c0.801-0.813,1.62-1.203,2.424-1.485c1.036-0.361,1.643-0.528,2.251-1.358c0.321-0.434,0.426-1.254,0.496-2.138   c-0.545,0.595-0.974,1-1.463,1.254c-0.443,0.229-1.733,0.597-2.133,0.136c0.423-0.936,1.198-1.737,2.125-2.191   c1.239-0.606,2.414-0.358,3.326,0.617c0.26-0.975,0.099-2.146-0.685-2.863c-0.817-0.747-2.518-0.479-3.419,0.004   c0.111-0.713-0.266-1.4-1.29-1.505c-0.7-0.071-1.415,0.131-2.076,0.319c-0.995,0.283-1.744,0.717-2.669,1.208l-0.001-5.406H104.819   L104.819,29.99L104.819,29.99z M71.015,35.744c-0.337,0.165-0.664,0.439-0.921,0.726c-0.376,0.455-1.591,0.228-2.284,0.438   c-0.421,0.126-0.62,0.302-0.649,0.225c0.21-0.431,0.358-0.862,0.71-1.195C68.637,35.208,70.954,34.697,71.015,35.744L71.015,35.744   L71.015,35.744z M28.319,113.979h-0.351l-7.691-95.215h0.179c1.328,3.707,4.892,4.64,7.863,2.526V113.979L28.319,113.979z    M104.819,20.938v0.352h-76.5c2.696-2.716,1.673-6.985-1.87-8.475v-0.151L104.819,20.938L104.819,20.938z" id="path14"></path>
	<path d="M48.164,40.88c0-0.835-0.648-1.518-1.439-1.518c-0.794,0-1.437,0.683-1.437,1.518c0,0.841,0.643,1.522,1.437,1.522   C47.516,42.403,48.164,41.722,48.164,40.88L48.164,40.88z M45.519,38.209c0-0.84-0.647-1.526-1.438-1.526   c-0.794,0-1.438,0.686-1.438,1.526c0,0.834,0.643,1.519,1.438,1.519C44.872,39.728,45.519,39.044,45.519,38.209L45.519,38.209z    M41.845,39.796c-0.794,0-1.439,0.685-1.439,1.521c0,0.841,0.645,1.522,1.439,1.522c0.791,0,1.439-0.682,1.439-1.522   C43.284,40.481,42.636,39.796,41.845,39.796L41.845,39.796z" id="path16"></path>
	<line fill="none" stroke="#000000" stroke-width="1.31416" x1="138.65199" y1="126.001" x2="642.35284" y2="126.001" id="line18"></line>
	
	<g id="g88" transform="translate(9.823763,-30.890112)">
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	<g aria-label="Wydział Elektroniki, Fotoniki i Mikrosystemów" id="text944" style="font-size:25.3333px;line-height:1.25;font-family:ZapfHumnstEU;-inkscape-font-specification:ZapfHumnstEU" transform="translate(-55.589823,-51.272167)"><path d="m 219.97258,219.62874 q -1.62133,4.76266 -5.77599,17.30264 -0.40533,-0.10133 -0.88667,-0.10133 -0.532,0 -0.912,0.12666 -1.87466,-6.45999 -4.66132,-14.18664 l -4.73733,14.16131 q -0.50667,-0.12667 -0.88667,-0.12667 -0.37999,0 -0.88666,0.12667 -1.95066,-6.45999 -5.42133,-17.30264 0.532,0.10133 1.216,0.10133 0.684,0 1.216,-0.10133 2.07733,7.67599 4.38266,14.89598 2.63466,-7.21999 4.76266,-14.89598 0.38,0.10133 0.81067,0.10133 0.456,0 0.836,-0.10133 2.22933,7.29599 4.86399,14.64264 2.508,-7.19465 4.40799,-14.64264 0.38,0.10133 0.81067,0.10133 0.48133,0 0.86133,-0.10133 z" id="path974"></path><path d="m 231.5245,224.97406 q -0.76,1.49467 -2.40666,5.21866 l -3.39466,7.67599 q -1.84934,4.18 -2.30534,5.97866 -0.40533,-0.076 -0.86133,-0.076 -0.43066,0 -0.88666,0.076 1.26666,-2.128 2.78666,-5.64932 l 0.58267,-1.34267 -1.064,-2.78666 q -0.76,-1.976 -3.952,-9.09466 0.532,0.10134 1.24133,0.10134 0.684,0 1.216,-0.10134 0.65867,2.30533 2.71067,7.34666 l 0.88666,2.17866 0.912,-2.10266 q 1.92533,-4.45866 2.83733,-7.42266 0.38,0.10134 0.86133,0.10134 0.456,0 0.836,-0.10134 z" id="path976"></path><path d="m 244.01379,236.93138 q -0.58266,-0.12667 -1.064,-0.12667 -0.48133,0 -1.064,0.12667 0.0507,-0.96266 0.0507,-1.49466 0,-0.63334 -0.0253,-0.96267 -1.39333,2.68533 -4.332,2.68533 -2.27999,0 -3.69866,-1.62133 -1.39333,-1.64666 -1.39333,-4.38266 0,-2.888 1.49467,-4.63599 1.51999,-1.77334 3.87599,-1.77334 2.60933,0 4.00266,2.33067 0,-1.26667 0.0253,-2.78667 0,-1.51999 0,-1.77333 0,-2.38133 -0.076,-4.58532 0.65866,0.17733 1.08933,0.17733 0.456,0 1.064,-0.17733 -0.10134,3.01466 -0.10134,8.13199 0,6.00399 0.152,10.86798 z m -2.10266,-6.33332 q 0,-2.356 -0.93733,-3.62267 -0.93734,-1.26666 -2.60933,-1.26666 -1.77333,0 -2.78667,1.39333 -0.988,1.39333 -0.988,3.97733 0,2.45733 0.912,3.79999 0.93734,1.31734 2.584,1.31734 1.824,0 2.812,-1.41867 1.01333,-1.444 1.01333,-4.17999 z" id="path978"></path><path d="m 256.45243,225.48073 q -4.96533,6.25732 -7.82799,10.38665 5.19333,-0.076 7.70132,-0.38 -0.0507,0.40534 -0.0507,0.58267 0,0.40533 0.076,0.86133 -3.85067,-0.10133 -5.82666,-0.10133 -2.68533,0 -4.788,0.10133 v -0.532 q 5.52266,-6.81466 8.00533,-10.33598 h -1.01334 q -2.76133,0 -5.64932,0.32933 0.0253,-0.152 0.0253,-0.50667 0,-0.25333 -0.0507,-0.86133 2.93867,0.0507 4.256,0.0507 2.93866,0 5.14266,-0.10134 z" id="path980"></path><path d="m 261.62039,220.56607 q 0,0.532 -0.38,0.912 -0.38,0.38 -0.912,0.38 -0.532,0 -0.91199,-0.38 -0.38,-0.38 -0.38,-0.912 0,-0.532 0.38,-0.88667 0.37999,-0.38 0.91199,-0.38 0.532,0 0.912,0.38 0.38,0.35467 0.38,0.88667 z m -0.25333,16.36531 q -0.55733,-0.12667 -1.03867,-0.12667 -0.456,0 -1.03866,0.12667 0.12667,-3.47066 0.12667,-6.28266 0,-2.58399 -0.12667,-5.67466 0.48133,0.10134 1.03866,0.10134 0.608,0 1.03867,-0.10134 -0.12667,3.116 -0.12667,5.67466 0,2.812 0.12667,6.28266 z" id="path982"></path><path d="m 275.09769,236.52605 q -1.368,0.40533 -2.07733,0.40533 -1.16533,0 -1.39333,-1.46933 -1.62134,1.69733 -3.77467,1.69733 -3.49599,0 -3.49599,-3.11599 0,-2.66 2.93866,-3.29333 1.39333,-0.27867 2.812,-0.55734 1.19066,-0.25333 1.596,-0.608 v -0.53199 q 0,-1.69734 -0.65867,-2.508 -0.63333,-0.81067 -2.15333,-0.81067 -2.07733,0 -3.268,1.79867 h -0.20266 l 0.0507,-1.34267 q 1.69734,-1.41866 4.07867,-1.41866 2.12799,0 3.06532,1.03866 0.93734,1.01333 0.93734,3.21733 v 0.304 l -0.10134,5.04133 q 0,0.86133 0.12667,1.16533 0.228,0.50667 0.988,0.50667 0.27867,0 0.43067,-0.0253 z m -3.44533,-2.60933 v -3.268 q -2.98933,0.50667 -3.97733,1.01333 -1.24133,0.63334 -1.24133,2.052 0,2.40667 2.25466,2.40667 1.41867,0 2.53333,-1.11467 0.43067,-0.43067 0.43067,-1.08933 z" id="path984"></path><path d="m 281.48166,224.41673 q -0.63333,0.38 -1.824,1.16533 0,8.68932 0.12667,11.34932 -0.55734,-0.076 -1.08934,-0.076 -0.50666,0 -1.01333,0.076 0.10134,-2.93866 0.10134,-6.40932 v -3.67333 q -0.32934,0.25333 -1.748,1.39333 v -1.31733 q 0.86133,-0.48133 1.77333,-1.14 v -0.65867 q 0,-4.55999 -0.12667,-7.19465 0.65867,0.0507 1.01333,0.0507 0.38,0 1.08934,-0.0507 -0.12667,2.71066 -0.12667,6.30799 v 0.27866 q 0.988,-0.70933 1.824,-1.44399 z" id="path986"></path><path d="m 300.02554,236.93138 q -1.368,-0.0507 -4.332,-0.0507 -3.06533,0 -4.68666,0.0507 0.20267,-3.11599 0.20267,-8.84132 0,-5.16799 -0.17733,-8.46132 1.444,0.076 3.09066,0.076 1.69733,0 5.80133,-0.076 0,0.10133 0,0.35466 -0.0253,0.25334 -0.0253,0.38 0,0.10134 0.0253,0.35467 0,0.25333 0,0.38 -2.888,-0.25333 -6.004,-0.25333 h -0.58266 q -0.0507,3.01466 -0.0507,5.34532 v 1.01333 h 0.456 q 2.33066,0 5.49733,-0.20266 -0.0507,0.50666 -0.0507,0.78533 0,0.25333 0.0507,0.70933 -1.11467,-0.20266 -4.788,-0.20266 h -1.19066 v 1.21599 q 0,1.11467 0.0507,6.18133 h 0.63334 q 2.27999,0 6.07999,-0.27867 0,0.12667 0,0.38 -0.0253,0.25334 -0.0253,0.38 0,0.12667 0.0253,0.38 0,0.25333 0,0.38 z" id="path988"></path><path d="m 305.29484,236.93138 q -0.55734,-0.076 -1.08934,-0.076 -0.50666,0 -1.01333,0.076 0.10134,-1.69733 0.10134,-7.39732 v -6.63733 q 0,-3.57199 -0.10134,-4.96532 0.65867,0.0507 1.01333,0.0507 0.38,0 1.08934,-0.0507 -0.12667,2.33066 -0.12667,7.80265 0,8.43599 0.12667,11.19732 z" id="path990"></path><path d="m 319.02548,230.24339 q 0,0.076 0,0.27867 -0.0253,0.17733 -0.0253,0.27866 h -8.71466 v 0.076 q 0,5.26933 4.256,5.26933 2.17866,0 3.90133,-1.69733 -0.0507,0.65866 -0.0507,0.96266 v 0.304 q -1.976,1.444 -4.30666,1.444 -2.66,0 -4.33199,-1.72266 -1.64667,-1.72267 -1.64667,-4.45866 0,-2.83733 1.596,-4.53466 1.596,-1.72267 4.23066,-1.72267 2.432,0 3.74933,1.444 1.34266,1.41866 1.34266,4.07866 z m -2.02666,-0.32933 v -0.43067 q 0,-1.87466 -0.86133,-2.91333 -0.836,-1.064 -2.30533,-1.064 -1.444,0 -2.432,1.16533 -0.988,1.24134 -1.064,3.24267 z" id="path992"></path><path d="m 332.27476,236.93138 q -0.63333,-0.10133 -1.41866,-0.10133 -0.73467,0 -1.31734,0.10133 -4.63599,-6.28266 -5.34532,-6.28266 -0.25334,0 -0.25334,0.35467 v 1.41866 q 0,2.128 0.152,4.50933 -0.58266,-0.12667 -1.06399,-0.12667 -0.48134,0 -1.064,0.12667 0.12666,-4.88933 0.12666,-9.49999 0,-5.47199 -0.12666,-9.49998 0.70933,0.10133 1.064,0.10133 0.35466,0 1.06399,-0.10133 -0.152,6.18132 -0.152,10.91865 v 0.86133 q 0,0.43067 0.43067,0.43067 0.40533,0 1.77333,-1.26667 1.62133,-1.49466 3.52133,-3.90133 0.58267,0.076 1.11467,0.076 0.55733,0 1.11466,-0.076 -1.01333,0.684 -3.29333,2.83733 l -2.28,2.15333 q 1.84934,2.128 5.95333,6.96666 z" id="path994"></path><path d="m 340.07737,236.32338 q -1.292,0.86133 -2.76133,0.86133 -1.748,0 -2.48266,-0.81066 -0.73467,-0.836 -0.73467,-2.66 0,-0.38 0.0507,-2.65999 0.076,-2.30533 0.076,-4.23067 v -0.86133 h -0.27867 q -0.63333,0 -1.31733,0.076 0.0507,-0.456 0.0507,-0.65866 0,-0.076 0,-0.20267 -0.0253,-0.152 -0.0253,-0.20267 0.81067,0.076 1.62133,0.076 v -0.836 q 0,-0.81066 -0.0507,-2.12799 1.19066,-0.20267 2.02666,-0.63333 -0.076,1.62133 -0.076,2.00133 v 1.67199 q 1.39333,0 3.29333,-0.152 -0.076,0.38 -0.076,0.836 v 0.20267 q -1.368,-0.076 -2.33066,-0.076 -0.63334,0 -0.912,0.0253 l -0.0507,1.26667 q 0,0.73466 -0.0507,2.68533 -0.0507,1.95066 -0.0507,3.19199 0,1.69733 0.48133,2.45733 0.48133,0.73467 1.64666,0.73467 0.65867,0 1.77334,-0.532 z" id="path996"></path><path d="m 347.65202,224.97406 q -0.12667,0.65867 -0.12667,1.92533 l -0.20266,0.12667 q -0.63333,-0.32933 -1.216,-0.32933 -1.41867,0 -2.052,1.24133 -0.608,1.24133 -0.608,3.87599 0,3.21733 0.12667,5.11733 -0.48133,-0.10133 -1.08933,-0.10133 -0.456,0 -0.96267,0.076 0.12667,-2.98933 0.12667,-8.25866 0,-2.30533 -0.12667,-3.67333 0.50667,0.10134 1.08933,0.10134 0.58267,0 1.064,-0.10134 -0.152,1.216 -0.152,2.78667 1.368,-2.91333 3.16667,-2.91333 0.27866,0 0.96266,0.12666 z" id="path998"></path><path d="m 360.87598,230.95272 q 0,2.78667 -1.69733,4.50933 -1.69734,1.69733 -4.30667,1.69733 -2.63466,0 -4.33199,-1.72266 -1.672,-1.72267 -1.672,-4.484 0,-2.73599 1.69733,-4.45866 1.72267,-1.748 4.30666,-1.748 2.66,0 4.332,1.72267 1.672,1.72266 1.672,4.48399 z m -2.15333,0.152 q 0,-5.59866 -3.876,-5.59866 -3.82533,0 -3.82533,5.42133 0,5.47199 3.85066,5.47199 3.85067,0 3.85067,-5.29466 z" id="path1000"></path><path d="m 373.74528,236.93138 q -0.58266,-0.12667 -1.03866,-0.12667 -0.456,0 -1.03867,0.12667 0.152,-2.66 0.152,-7.16932 0,-3.74933 -2.888,-3.74933 -1.49466,0 -2.35599,1.08933 -0.86133,1.08933 -0.86133,3.952 v 1.13999 q 0,3.44533 0.076,4.73733 -0.58267,-0.12667 -1.064,-0.12667 -0.456,0 -1.03867,0.12667 0.10133,-1.41866 0.10133,-4.40799 v -1.79867 q 0,-3.95199 -0.10133,-5.75066 0.48133,0.10134 1.03867,0.10134 0.58266,0 0.988,-0.10134 -0.0507,0.912 -0.0507,1.292 0,0.152 0.0253,0.456 0,0.304 0,0.456 1.444,-2.45733 3.97733,-2.45733 4.05333,0 4.05333,4.53466 0,0.63333 -0.0253,1.87467 -0.0253,1.21599 -0.0253,1.79866 0,1.87466 0.076,4.00266 z" id="path1002"></path><path d="m 380.07858,220.56607 q 0,0.532 -0.38,0.912 -0.38,0.38 -0.912,0.38 -0.532,0 -0.912,-0.38 -0.38,-0.38 -0.38,-0.912 0,-0.532 0.38,-0.88667 0.38,-0.38 0.912,-0.38 0.532,0 0.912,0.38 0.38,0.35467 0.38,0.88667 z m -0.25334,16.36531 q -0.55733,-0.12667 -1.03866,-0.12667 -0.456,0 -1.03867,0.12667 0.12667,-3.47066 0.12667,-6.28266 0,-2.58399 -0.12667,-5.67466 0.48133,0.10134 1.03867,0.10134 0.608,0 1.03866,-0.10134 -0.12666,3.116 -0.12666,5.67466 0,2.812 0.12666,6.28266 z" id="path1004"></path><path d="m 394.1892,236.93138 q -0.63333,-0.10133 -1.41866,-0.10133 -0.73467,0 -1.31733,0.10133 -4.636,-6.28266 -5.34533,-6.28266 -0.25333,0 -0.25333,0.35467 v 1.41866 q 0,2.128 0.152,4.50933 -0.58267,-0.12667 -1.064,-0.12667 -0.48133,0 -1.064,0.12667 0.12667,-4.88933 0.12667,-9.49999 0,-5.47199 -0.12667,-9.49998 0.70933,0.10133 1.064,0.10133 0.35467,0 1.064,-0.10133 -0.152,6.18132 -0.152,10.91865 v 0.86133 q 0,0.43067 0.43066,0.43067 0.40534,0 1.77334,-1.26667 1.62133,-1.49466 3.52132,-3.90133 0.58267,0.076 1.11467,0.076 0.55733,0 1.11466,-0.076 -1.01333,0.684 -3.29332,2.83733 l -2.28,2.15333 q 1.84933,2.128 5.95332,6.96666 z" id="path1006"></path><path d="m 398.67315,220.56607 q 0,0.532 -0.38,0.912 -0.38,0.38 -0.912,0.38 -0.532,0 -0.912,-0.38 -0.38,-0.38 -0.38,-0.912 0,-0.532 0.38,-0.88667 0.38,-0.38 0.912,-0.38 0.532,0 0.912,0.38 0.38,0.35467 0.38,0.88667 z m -0.25333,16.36531 q -0.55734,-0.12667 -1.03867,-0.12667 -0.456,0 -1.03866,0.12667 0.12666,-3.47066 0.12666,-6.28266 0,-2.58399 -0.12666,-5.67466 0.48133,0.10134 1.03866,0.10134 0.608,0 1.03867,-0.10134 -0.12667,3.116 -0.12667,5.67466 0,2.812 0.12667,6.28266 z" id="path1008"></path><path d="m 405.51312,235.10738 q 0,0.38 -0.32933,0.96267 l -3.14133,5.47199 -0.40533,-0.17733 1.77333,-6.05466 q 0.32933,-1.16533 1.16533,-1.16533 0.93733,0 0.93733,0.96266 z" id="path1010"></path><path d="m 425.729,221.2754 q -1.77333,-0.38 -6.10533,-0.38 h -0.608 q -0.076,1.34267 -0.076,3.77466 v 2.53333 h 2.02667 q 2.25466,0 4.28133,-0.17733 -0.0253,0.228 -0.0253,0.73467 0,0.48133 0.0253,0.73466 -3.724,-0.228 -5.57333,-0.228 h -0.73467 v 5.82666 q 0,2.17867 0.10134,2.83733 -0.58267,-0.10133 -1.26667,-0.10133 -0.608,0 -1.08933,0.10133 0.20267,-2.60933 0.20267,-6.43466 0,-5.42132 -0.20267,-10.86798 1.41867,0.076 3.44533,0.076 2.02666,0 5.59866,-0.076 0,0.12666 0,0.40533 -0.0253,0.27867 -0.0253,0.43067 0,0.12666 0.0253,0.40533 0,0.25333 0,0.40533 z" id="path1012"></path><path d="m 439.10489,230.95272 q 0,2.78667 -1.69733,4.50933 -1.69733,1.69733 -4.30666,1.69733 -2.63467,0 -4.332,-1.72266 -1.672,-1.72267 -1.672,-4.484 0,-2.73599 1.69734,-4.45866 1.72266,-1.748 4.30666,-1.748 2.65999,0 4.33199,1.72267 1.672,1.72266 1.672,4.48399 z m -2.15333,0.152 q 0,-5.59866 -3.876,-5.59866 -3.82532,0 -3.82532,5.42133 0,5.47199 3.85066,5.47199 3.85066,0 3.85066,-5.29466 z" id="path1014"></path><path d="m 447.76887,236.32338 q -1.292,0.86133 -2.76133,0.86133 -1.748,0 -2.48267,-0.81066 -0.73466,-0.836 -0.73466,-2.66 0,-0.38 0.0507,-2.65999 0.076,-2.30533 0.076,-4.23067 v -0.86133 h -0.27866 q -0.63334,0 -1.31733,0.076 0.0507,-0.456 0.0507,-0.65866 0,-0.076 0,-0.20267 -0.0253,-0.152 -0.0253,-0.20267 0.81066,0.076 1.62133,0.076 v -0.836 q 0,-0.81066 -0.0507,-2.12799 1.19067,-0.20267 2.02667,-0.63333 -0.076,1.62133 -0.076,2.00133 v 1.67199 q 1.39333,0 3.29333,-0.152 -0.076,0.38 -0.076,0.836 v 0.20267 q -1.368,-0.076 -2.33067,-0.076 -0.63333,0 -0.912,0.0253 l -0.0507,1.26667 q 0,0.73466 -0.0507,2.68533 -0.0507,1.95066 -0.0507,3.19199 0,1.69733 0.48134,2.45733 0.48133,0.73467 1.64666,0.73467 0.65867,0 1.77333,-0.532 z" id="path1016"></path><path d="m 460.25818,230.95272 q 0,2.78667 -1.69733,4.50933 -1.69733,1.69733 -4.30666,1.69733 -2.63467,0 -4.332,-1.72266 -1.672,-1.72267 -1.672,-4.484 0,-2.73599 1.69734,-4.45866 1.72266,-1.748 4.30666,-1.748 2.65999,0 4.33199,1.72267 1.672,1.72266 1.672,4.48399 z m -2.15333,0.152 q 0,-5.59866 -3.876,-5.59866 -3.82532,0 -3.82532,5.42133 0,5.47199 3.85066,5.47199 3.85066,0 3.85066,-5.29466 z" id="path1018"></path><path d="m 473.12747,236.93138 q -0.58267,-0.12667 -1.03867,-0.12667 -0.456,0 -1.03866,0.12667 0.152,-2.66 0.152,-7.16932 0,-3.74933 -2.888,-3.74933 -1.49466,0 -2.356,1.08933 -0.86133,1.08933 -0.86133,3.952 v 1.13999 q 0,3.44533 0.076,4.73733 -0.58266,-0.12667 -1.064,-0.12667 -0.456,0 -1.03866,0.12667 0.10133,-1.41866 0.10133,-4.40799 v -1.79867 q 0,-3.95199 -0.10133,-5.75066 0.48133,0.10134 1.03866,0.10134 0.58267,0 0.988,-0.10134 -0.0507,0.912 -0.0507,1.292 0,0.152 0.0253,0.456 0,0.304 0,0.456 1.444,-2.45733 3.97733,-2.45733 4.05332,0 4.05332,4.53466 0,0.63333 -0.0253,1.87467 -0.0253,1.21599 -0.0253,1.79866 0,1.87466 0.076,4.00266 z" id="path1020"></path><path d="m 479.46078,220.56607 q 0,0.532 -0.38,0.912 -0.38,0.38 -0.912,0.38 -0.532,0 -0.912,-0.38 -0.38,-0.38 -0.38,-0.912 0,-0.532 0.38,-0.88667 0.38,-0.38 0.912,-0.38 0.532,0 0.912,0.38 0.38,0.35467 0.38,0.88667 z m -0.25333,16.36531 q -0.55734,-0.12667 -1.03867,-0.12667 -0.456,0 -1.03867,0.12667 0.12667,-3.47066 0.12667,-6.28266 0,-2.58399 -0.12667,-5.67466 0.48134,0.10134 1.03867,0.10134 0.608,0 1.03867,-0.10134 -0.12667,3.116 -0.12667,5.67466 0,2.812 0.12667,6.28266 z" id="path1022"></path><path d="m 493.57142,236.93138 q -0.63333,-0.10133 -1.41866,-0.10133 -0.73467,0 -1.31733,0.10133 -4.636,-6.28266 -5.34533,-6.28266 -0.25333,0 -0.25333,0.35467 v 1.41866 q 0,2.128 0.152,4.50933 -0.58267,-0.12667 -1.064,-0.12667 -0.48134,0 -1.064,0.12667 0.12666,-4.88933 0.12666,-9.49999 0,-5.47199 -0.12666,-9.49998 0.70933,0.10133 1.064,0.10133 0.35466,0 1.064,-0.10133 -0.152,6.18132 -0.152,10.91865 v 0.86133 q 0,0.43067 0.43066,0.43067 0.40533,0 1.77333,-1.26667 1.62133,-1.49466 3.52133,-3.90133 0.58267,0.076 1.11467,0.076 0.55733,0 1.11466,-0.076 -1.01333,0.684 -3.29333,2.83733 l -2.27999,2.15333 q 1.84933,2.128 5.95332,6.96666 z" id="path1024"></path><path d="m 498.05535,220.56607 q 0,0.532 -0.38,0.912 -0.38,0.38 -0.912,0.38 -0.532,0 -0.912,-0.38 -0.37999,-0.38 -0.37999,-0.912 0,-0.532 0.37999,-0.88667 0.38,-0.38 0.912,-0.38 0.532,0 0.912,0.38 0.38,0.35467 0.38,0.88667 z m -0.25333,16.36531 q -0.55733,-0.12667 -1.03867,-0.12667 -0.456,0 -1.03866,0.12667 0.12666,-3.47066 0.12666,-6.28266 0,-2.58399 -0.12666,-5.67466 0.48133,0.10134 1.03866,0.10134 0.608,0 1.03867,-0.10134 -0.12667,3.116 -0.12667,5.67466 0,2.812 0.12667,6.28266 z" id="path1026"></path><path d="m 511.27926,220.56607 q 0,0.532 -0.38,0.912 -0.38,0.38 -0.912,0.38 -0.532,0 -0.912,-0.38 -0.38,-0.38 -0.38,-0.912 0,-0.532 0.38,-0.88667 0.38,-0.38 0.912,-0.38 0.532,0 0.912,0.38 0.38,0.35467 0.38,0.88667 z m -0.25333,16.36531 q -0.55734,-0.12667 -1.03867,-0.12667 -0.456,0 -1.03866,0.12667 0.12666,-3.47066 0.12666,-6.28266 0,-2.58399 -0.12666,-5.67466 0.48133,0.10134 1.03866,0.10134 0.608,0 1.03867,-0.10134 -0.12667,3.116 -0.12667,5.67466 0,2.812 0.12667,6.28266 z" id="path1028"></path><path d="m 540.94451,236.93138 q -0.63333,-0.12667 -1.14,-0.12667 -0.50667,0 -1.14,0.12667 -0.65866,-9.44932 -1.31733,-12.64132 -4.96533,8.30933 -6.48532,12.61599 h -0.35467 q -0.532,-1.824 -2.40666,-5.29466 l -3.952,-7.29599 q -1.19066,8.41065 -1.24133,12.61598 -0.50667,-0.12667 -0.93733,-0.12667 -0.43067,0 -1.01333,0.12667 0.88666,-3.92666 2.60933,-17.63198 h 0.43066 q 4.20533,8.46133 7.11866,13.75599 3.24266,-5.75066 7.49866,-13.75599 h 0.32933 q 0.65866,6.40933 2.00133,17.63198 z" id="path1030"></path><path d="m 546.72045,220.56607 q 0,0.532 -0.38,0.912 -0.38,0.38 -0.912,0.38 -0.532,0 -0.91199,-0.38 -0.38,-0.38 -0.38,-0.912 0,-0.532 0.38,-0.88667 0.37999,-0.38 0.91199,-0.38 0.532,0 0.912,0.38 0.38,0.35467 0.38,0.88667 z m -0.25333,16.36531 q -0.55733,-0.12667 -1.03867,-0.12667 -0.456,0 -1.03866,0.12667 0.12667,-3.47066 0.12667,-6.28266 0,-2.58399 -0.12667,-5.67466 0.48133,0.10134 1.03866,0.10134 0.608,0 1.03867,-0.10134 -0.12667,3.116 -0.12667,5.67466 0,2.812 0.12667,6.28266 z" id="path1032"></path><path d="m 560.8311,236.93138 q -0.63334,-0.10133 -1.41867,-0.10133 -0.73467,0 -1.31733,0.10133 -4.63599,-6.28266 -5.34533,-6.28266 -0.25333,0 -0.25333,0.35467 v 1.41866 q 0,2.128 0.152,4.50933 -0.58267,-0.12667 -1.064,-0.12667 -0.48133,0 -1.064,0.12667 0.12667,-4.88933 0.12667,-9.49999 0,-5.47199 -0.12667,-9.49998 0.70933,0.10133 1.064,0.10133 0.35467,0 1.064,-0.10133 -0.152,6.18132 -0.152,10.91865 v 0.86133 q 0,0.43067 0.43067,0.43067 0.40533,0 1.77333,-1.26667 1.62133,-1.49466 3.52133,-3.90133 0.58266,0.076 1.11466,0.076 0.55733,0 1.11467,-0.076 -1.01334,0.684 -3.29333,2.83733 l -2.28,2.15333 q 1.84933,2.128 5.95333,6.96666 z" id="path1034"></path><path d="m 568.88702,224.97406 q -0.12667,0.65867 -0.12667,1.92533 l -0.20266,0.12667 q -0.63333,-0.32933 -1.216,-0.32933 -1.41866,0 -2.052,1.24133 -0.608,1.24133 -0.608,3.87599 0,3.21733 0.12667,5.11733 -0.48133,-0.10133 -1.08933,-0.10133 -0.456,0 -0.96267,0.076 0.12667,-2.98933 0.12667,-8.25866 0,-2.30533 -0.12667,-3.67333 0.50667,0.10134 1.08933,0.10134 0.58267,0 1.064,-0.10134 -0.152,1.216 -0.152,2.78667 1.368,-2.91333 3.16667,-2.91333 0.27866,0 0.96266,0.12666 z" id="path1036"></path><path d="m 582.11101,230.95272 q 0,2.78667 -1.69733,4.50933 -1.69733,1.69733 -4.30666,1.69733 -2.63467,0 -4.332,-1.72266 -1.672,-1.72267 -1.672,-4.484 0,-2.73599 1.69733,-4.45866 1.72267,-1.748 4.30667,-1.748 2.65999,0 4.33199,1.72267 1.672,1.72266 1.672,4.48399 z m -2.15333,0.152 q 0,-5.59866 -3.876,-5.59866 -3.82533,0 -3.82533,5.42133 0,5.47199 3.85067,5.47199 3.85066,0 3.85066,-5.29466 z" id="path1038"></path><path d="m 591.38298,233.18205 q 0,1.72267 -1.24133,2.86267 -1.24133,1.11466 -3.24266,1.11466 -1.976,0 -3.268,-0.912 0.38,-0.96266 0.608,-1.95066 1.24134,1.92533 3.09067,1.92533 1.13999,0 1.79866,-0.608 0.65867,-0.63333 0.65867,-1.69733 0,-1.52 -2.00133,-2.07733 l -1.16534,-0.32933 q -1.44399,-0.40534 -2.10266,-1.16534 -0.63333,-0.76 -0.63333,-2.10266 0,-1.52 1.064,-2.508 1.06399,-0.988 2.81199,-0.988 1.824,0 3.16666,0.836 -0.38,0.78534 -0.53199,1.596 -1.444,-1.672 -2.93867,-1.672 -0.96266,0 -1.57066,0.608 -0.58267,0.58267 -0.58267,1.52 0,1.57066 1.92533,2.128 l 1.72267,0.50666 q 2.43199,0.70934 2.43199,2.91333 z" id="path1040"></path><path d="m 603.79626,224.97406 q -0.76,1.49467 -2.40666,5.21866 l -3.39466,7.67599 q -1.84933,4.18 -2.30533,5.97866 -0.40534,-0.076 -0.86134,-0.076 -0.43066,0 -0.88666,0.076 1.26666,-2.128 2.78666,-5.64932 l 0.58267,-1.34267 -1.064,-2.78666 q -0.76,-1.976 -3.952,-9.09466 0.532,0.10134 1.24134,0.10134 0.68399,0 1.21599,-0.10134 0.65867,2.30533 2.71067,7.34666 l 0.88666,2.17866 0.912,-2.10266 q 1.92533,-4.45866 2.83733,-7.42266 0.38,0.10134 0.86133,0.10134 0.456,0 0.836,-0.10134 z" id="path1042"></path><path d="m 612.23223,233.18205 q 0,1.72267 -1.24133,2.86267 -1.24134,1.11466 -3.24267,1.11466 -1.97599,0 -3.26799,-0.912 0.38,-0.96266 0.608,-1.95066 1.24133,1.92533 3.09066,1.92533 1.14,0 1.79866,-0.608 0.65867,-0.63333 0.65867,-1.69733 0,-1.52 -2.00133,-2.07733 l -1.16533,-0.32933 q -1.444,-0.40534 -2.10267,-1.16534 -0.63333,-0.76 -0.63333,-2.10266 0,-1.52 1.064,-2.508 1.064,-0.988 2.812,-0.988 1.82399,0 3.16666,0.836 -0.38,0.78534 -0.532,1.596 -1.444,-1.672 -2.93866,-1.672 -0.96267,0 -1.57067,0.608 -0.58266,0.58267 -0.58266,1.52 0,1.57066 1.92533,2.128 l 1.72266,0.50666 q 2.432,0.70934 2.432,2.91333 z" id="path1044"></path><path d="m 620.64284,236.32338 q -1.29199,0.86133 -2.76133,0.86133 -1.74799,0 -2.48266,-0.81066 -0.73467,-0.836 -0.73467,-2.66 0,-0.38 0.0507,-2.65999 0.076,-2.30533 0.076,-4.23067 v -0.86133 h -0.27866 q -0.63334,0 -1.31734,0.076 0.0507,-0.456 0.0507,-0.65866 0,-0.076 0,-0.20267 -0.0253,-0.152 -0.0253,-0.20267 0.81066,0.076 1.62133,0.076 v -0.836 q 0,-0.81066 -0.0507,-2.12799 1.19067,-0.20267 2.02667,-0.63333 -0.076,1.62133 -0.076,2.00133 v 1.67199 q 1.39333,0 3.29332,-0.152 -0.076,0.38 -0.076,0.836 v 0.20267 q -1.36799,-0.076 -2.33066,-0.076 -0.63333,0 -0.912,0.0253 l -0.0507,1.26667 q 0,0.73466 -0.0507,2.68533 -0.0507,1.95066 -0.0507,3.19199 0,1.69733 0.48134,2.45733 0.48133,0.73467 1.64666,0.73467 0.65867,0 1.77333,-0.532 z" id="path1046"></path><path d="m 632.04282,230.24339 q 0,0.076 0,0.27867 -0.0253,0.17733 -0.0253,0.27866 h -8.71465 v 0.076 q 0,5.26933 4.25599,5.26933 2.17866,0 3.90133,-1.69733 -0.0507,0.65866 -0.0507,0.96266 v 0.304 q -1.976,1.444 -4.30666,1.444 -2.66,0 -4.33199,-1.72266 -1.64667,-1.72267 -1.64667,-4.45866 0,-2.83733 1.596,-4.53466 1.596,-1.72267 4.23066,-1.72267 2.432,0 3.74933,1.444 1.34266,1.41866 1.34266,4.07866 z m -2.02666,-0.32933 v -0.43067 q 0,-1.87466 -0.86133,-2.91333 -0.836,-1.064 -2.30533,-1.064 -1.444,0 -2.432,1.16533 -0.988,1.24134 -1.064,3.24267 z" id="path1048"></path><path d="m 652.15742,236.93138 q -0.58267,-0.12667 -1.064,-0.12667 -0.456,0 -1.03867,0.12667 0.228,-4.07866 0.228,-7.01732 0,-2.00133 -0.684,-2.91333 -0.65866,-0.93733 -2.20399,-0.93733 -1.77333,0 -2.40667,1.62133 -0.53199,1.368 -0.53199,4.83866 0,2.30533 0.076,4.40799 -0.532,-0.076 -1.03867,-0.076 -0.50667,0 -1.01333,0.076 0.228,-3.52133 0.228,-6.73866 0,-2.17866 -0.58267,-3.14133 -0.58266,-0.96266 -2.00133,-0.96266 -1.46933,0 -2.28,1.01333 -0.58266,0.73467 -0.76,2.128 -0.12666,0.96266 -0.12666,3.29333 0,2.25466 0.12666,4.40799 -0.53199,-0.076 -1.03866,-0.076 -0.50667,0 -1.03867,0.076 0.10134,-1.01333 0.10134,-3.92666 v -4.12933 q 0,-2.91333 -0.10134,-3.90133 0.43067,0.10134 0.988,0.10134 0.532,0 0.96267,-0.10134 0,0.70934 -0.0507,2.128 1.824,-2.38133 4.028,-2.38133 1.21599,0 2.12799,0.684 0.93734,0.684 1.26667,1.84933 1.49466,-2.508 3.97733,-2.508 1.79866,0 2.81199,1.11467 1.03867,1.08933 1.03867,3.116 0,0.15199 -0.076,1.67199 -0.0507,1.49467 -0.0507,2.83733 0,1.08933 0.12667,3.44533 z" id="path1050"></path><path d="m 663.88675,220.18607 q 0,0.532 -0.76,1.01333 l -4.07866,2.53333 h -0.836 l 3.572,-3.69866 q 0.70933,-0.73467 1.19066,-0.73467 0.912,0 0.912,0.88667 z m 3.01466,10.76665 q 0,2.78667 -1.69733,4.50933 -1.69733,1.69733 -4.30666,1.69733 -2.63466,0 -4.33199,-1.72266 -1.672,-1.72267 -1.672,-4.484 0,-2.73599 1.69733,-4.45866 1.72266,-1.748 4.30666,-1.748 2.66,0 4.332,1.72267 1.67199,1.72266 1.67199,4.48399 z m -2.15333,0.152 q 0,-5.59866 -3.87599,-5.59866 -3.82533,0 -3.82533,5.42133 0,5.47199 3.85066,5.47199 3.85066,0 3.85066,-5.29466 z" id="path1052"></path><path d="m 686.48404,224.97406 q -4.05333,9.11999 -4.81332,11.95732 -0.38,-0.076 -0.76,-0.076 -0.35467,0 -0.73467,0.076 -0.25333,-1.57066 -3.116,-9.14532 -2.33066,5.59866 -3.19199,9.14532 -0.228,-0.0507 -0.70933,-0.0507 -0.48134,0 -0.73467,0.0507 -0.65866,-2.83733 -4.40799,-11.95732 0.50666,0.10134 1.11466,0.10134 0.63333,0 1.14,-0.10134 0.73467,2.964 3.16666,9.27199 1.824,-4.05333 3.31867,-9.27199 0.37999,0.076 0.75999,0.076 0.35467,0 0.73467,-0.076 1.672,6.232 3.16666,9.24666 1.34267,-2.76133 3.52133,-9.24666 0.55733,0.0507 0.78533,0.0507 0.25334,0 0.76,-0.0507 z" id="path1054"></path></g></g>
	
</g>
</svg>
                                            </a>
                    &nbsp;
                </h1>
                                    <div class="search-container">
                        <form class="pwr-form">
                            <div class="search-toggle pwr-btn-submit"><i class="fa fa-search"></i></div>
                        </form>
                    </div>
                                <div class="clear"></div>
            </div>
        </header>
                    <h2 class="portal-title"><span>Zespół Technologii Cienkowarstwowych</span></h2>
                      
</div>
<div class="clear"></div>

    <div class="container menu-cont">
            <div class="menu-button"><span>Menu</span> <i class="fa fa-bars"></i></div>
    <div class="menu-button-back"><i class="fa fa-caret-left"></i> <span>Powrót</span></div>

    <nav class="main-menu menu" role="menu">
        <a id="drop1" class="first main-dropdown active dropdown lev" href="https://tft.pwr.edu.pl/" title="" role="menuitem"><span>Strona główna<i class="fa fa-caret-down"></i></span></a><div id="dropped-drop1" class="dropped-menu dropdowns clearfix" role="menu" style="display: none; visibility: visible;"><div class="dropped-menu-column"><div class="dropped-menu-column-box"><a role="menuitem" data-level="2" data-menu="1" data-down="1" data-dropdown="level-2-1-1" class="first active lev" href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci" title=""><span class="title">Aktualności</span><img alt="" class="column-image" src="Aktualno%C5%9Bci%20_%20Zesp%C3%B3%C5%82%20Technologii%20Cienkowarstwowych_files/qABoNM1YIek9kAEQ,news.png" title=""></a></div></div><div class="dropped-menu-column"><div class="dropped-menu-column-box"><a role="menuitem" data-level="2" data-menu="1" data-down="2" data-dropdown="level-2-1-2" class=" lev" href="https://tft.pwr.edu.pl/strona-glowna/o-zespole" title=""><span class="title">O Zespole</span><img alt="" class="column-image" src="Aktualno%C5%9Bci%20_%20Zesp%C3%B3%C5%82%20Technologii%20Cienkowarstwowych_files/qABoNM1YIek9kAEQ,zespol.png" title=""></a></div></div><div class="dropped-menu-column"><div class="dropped-menu-column-box"><a role="menuitem" data-level="2" data-menu="1" data-down="3" data-dropdown="level-2-1-3" class=" lev" href="https://tft.pwr.edu.pl/strona-glowna/struktura" title=""><span class="title">Struktura</span><img alt="" class="column-image" src="Aktualno%C5%9Bci%20_%20Zesp%C3%B3%C5%82%20Technologii%20Cienkowarstwowych_files/qABoNM1YIek9kAEQ,struktura.png" title=""></a></div></div><div class="dropped-menu-column"><div class="dropped-menu-column-box"><a role="menuitem" data-level="2" data-menu="1" data-down="4" data-dropdown="level-2-1-4" class="last lev" href="https://tft.pwr.edu.pl/strona-glowna/galeria" title=""><span class="title">Galeria</span><img alt="" class="column-image" src="Aktualno%C5%9Bci%20_%20Zesp%C3%B3%C5%82%20Technologii%20Cienkowarstwowych_files/qABoNM1YIek9kAEQ,galeria2.png" title=""></a></div></div></div><a id="drop2" class="main-dropdown dropdown lev" href="https://tft.pwr.edu.pl/badania" title="" role="menuitem"><span>Badania<i class="fa fa-caret-down"></i></span></a><div id="dropped-drop2" class="dropped-menu dropdowns clearfix" role="menu" style="visibility: visible;"><div class="dropped-menu-column"><div class="dropped-menu-column-box"><a role="menuitem" data-level="2" data-menu="2" data-down="1" data-dropdown="level-2-2-1" class="first lev" href="https://tft.pwr.edu.pl/badania/publikacje" title=""><span class="title">Publikacje</span><img alt="" class="column-image" src="Aktualno%C5%9Bci%20_%20Zesp%C3%B3%C5%82%20Technologii%20Cienkowarstwowych_files/qABoNM1YIek9kAEQ,publikacje.png" title=""></a></div></div><div class="dropped-menu-column"><div class="dropped-menu-column-box"><a role="menuitem" data-level="2" data-menu="2" data-down="2" data-dropdown="level-2-2-2" class=" dropdown lev" href="https://tft.pwr.edu.pl/badania/granty" title=""><span class="title">Granty<i class="fa fa-caret-right"></i></span><img alt="" class="column-image" src="Aktualno%C5%9Bci%20_%20Zesp%C3%B3%C5%82%20Technologii%20Cienkowarstwowych_files/qABoNM1YIek9kAEQ,granty.png" title=""></a><div role="menu" data-dropped="leveled-level-2-2-2" class="column-links desktop" style="visibility: visible;"><a role="menuitem" data-level="3" data-menu="2" data-down="1" data-dropdown="level-3-2-1" class="first dropdown lev" href="https://tft.pwr.edu.pl/badania/granty/projekt-m-eranet-call-2022" title=""><span>Projekt M-Era.Net Call 2022<i class="fa fa-caret-right"></i></span></a><div role="menu" data-dropped="leveled-level-3-2-1" class="column-links" style="visibility: visible;"><a role="menuitem" data-level="4" data-menu="2" data-down="1" data-dropdown="level-4-2-1" class="first hide-mobile lev" href="https://tft.pwr.edu.pl/badania/granty/projekt-m-eranet-call-2022/galeria" title=""><span>Galeria<i class="fa fa-caret-right desktop"></i></span></a></div><a role="menuitem" data-level="3" data-menu="2" data-down="2" data-dropdown="level-3-2-2" class="last lev" href="https://tft.pwr.edu.pl/badania/granty/projekt-sonata-ncn" title=""><span>Projekt SONATA NCN<i class="fa fa-caret-right desktop"></i></span></a></div></div></div><div class="dropped-menu-column"><div class="dropped-menu-column-box"><a role="menuitem" data-level="2" data-menu="2" data-down="3" data-dropdown="level-2-2-3" class=" lev" href="https://tft.pwr.edu.pl/badania/aparatura" title=""><span class="title">Aparatura</span><img alt="" class="column-image" src="Aktualno%C5%9Bci%20_%20Zesp%C3%B3%C5%82%20Technologii%20Cienkowarstwowych_files/qABoNM1YIek9kAEQ,nasz-pajaczek.png" title=""></a></div></div><div class="dropped-menu-column"><div class="dropped-menu-column-box"><a role="menuitem" data-level="2" data-menu="2" data-down="4" data-dropdown="level-2-2-4" class=" lev" href="https://tft.pwr.edu.pl/badania/patenty" title=""><span class="title">Patenty</span><img alt="" class="column-image" src="Aktualno%C5%9Bci%20_%20Zesp%C3%B3%C5%82%20Technologii%20Cienkowarstwowych_files/qABoNM1YIek9kAEQ,patenty.png" title=""></a></div></div><div class="dropped-menu-column"><div class="dropped-menu-column-box"><a role="menuitem" data-level="2" data-menu="2" data-down="5" data-dropdown="level-2-2-5" class=" lev" href="https://tft.pwr.edu.pl/badania/wspolpraca" title=""><span class="title">Współpraca</span><img alt="" class="column-image" src="Aktualno%C5%9Bci%20_%20Zesp%C3%B3%C5%82%20Technologii%20Cienkowarstwowych_files/qABoNM1YIek9kAEQ,wspolpraca.png" title=""></a></div></div><div class="dropped-menu-column"><div class="dropped-menu-column-box"><a role="menuitem" data-level="2" data-menu="2" data-down="6" data-dropdown="level-2-2-6" class="last lev" href="https://tft.pwr.edu.pl/badania/oferta_dla_biznesu" title=""><span class="title">Oferta dla biznesu</span><img alt="" class="column-image" src="Aktualno%C5%9Bci%20_%20Zesp%C3%B3%C5%82%20Technologii%20Cienkowarstwowych_files/qABoNM1YIek9kAEQ,oferta-biznes.png" title=""></a></div></div></div><a id="drop3" class="main-dropdown dropdown lev" href="https://tft.pwr.edu.pl/dydaktyka" title="" role="menuitem"><span>Dydaktyka<i class="fa fa-caret-down"></i></span></a><div id="dropped-drop3" class="dropped-menu dropdowns clearfix" role="menu" style="visibility: visible;"><div class="dropped-menu-column"><div class="dropped-menu-column-box"><a role="menuitem" data-level="2" data-menu="3" data-down="1" data-dropdown="level-2-3-1" class="first lev" href="https://tft.pwr.edu.pl/dydaktyka/dyplomowanie" title=""><span class="title">Dyplomowanie</span><img alt="" class="column-image" src="Aktualno%C5%9Bci%20_%20Zesp%C3%B3%C5%82%20Technologii%20Cienkowarstwowych_files/qABoNM1YIek9kAEQ,dyplomy.png" title=""></a></div></div><div class="dropped-menu-column"><div class="dropped-menu-column-box"><a role="menuitem" data-level="2" data-menu="3" data-down="2" data-dropdown="level-2-3-2" class="last lev" href="https://tft.pwr.edu.pl/dydaktyka/zajecia-dydaktyczne" title=""><span class="title">Zajęcia dydaktyczne</span><img alt="" class="column-image" src="Aktualno%C5%9Bci%20_%20Zesp%C3%B3%C5%82%20Technologii%20Cienkowarstwowych_files/qABoNM1YIek9kAEQ,adobestock_169370871.jpeg" title=""></a></div></div></div><a class="main-dropdown lev" href="https://tft.pwr.edu.pl/kontakt" title="" role="menuitem"><span>Kontakt</span></a><a id="drop5" class="last main-dropdown dropdown lev" href="https://tft.pwr.edu.pl/kolo-naukowe-te" title="" role="menuitem"><span>Koło Naukowe TE<i class="fa fa-caret-down"></i></span></a><div id="dropped-drop5" class="dropped-menu dropdowns clearfix" role="menu" style="visibility: visible;"><div class="dropped-menu-column"><div class="dropped-menu-column-box"><a role="menuitem" data-level="2" data-menu="5" data-down="1" data-dropdown="level-2-5-1" class="first lev" href="https://tft.pwr.edu.pl/kolo-naukowe-te/realizowane-projekty" title=""><span class="title">Realizowane projekty</span><img alt="" class="column-image" src="Aktualno%C5%9Bci%20_%20Zesp%C3%B3%C5%82%20Technologii%20Cienkowarstwowych_files/qABoNM1YIek9kAEQ,adobestock_182042841.jpeg" title=""></a></div></div></div>    </nav>
    </div>

    <div class="clear"></div>

    <div class="container content-margin">

        <div class="row columns">
            <div class="column col-75 main-content right">
                <div class="column-content">
                    <div class="row columns inner">
                        <div class="column-content">
                                <ul vocab="http://schema.org/" typeof="BreadcrumbList" class="breadcrumb">
                <li property="itemListElement" typeof="ListItem" class="home"><a property="item" typeof="WebPage" href="https://tft.pwr.edu.pl/" title="Strona główna"><span property="name">Strona główna</span></a><meta property="position" content="1"></li>
                                    <li class="divider"><i class="fa fa-angle-right" aria-hidden="true"></i></li>
            <li property="itemListElement" typeof="ListItem"><a property="item" typeof="WebPage" href="https://tft.pwr.edu.pl/strona-glowna" title="Strona główna"><span property="name">Strona główna</span></a><meta property="position" content="2"></li>
            </ul>
                        </div>
                    </div>
                    <div class="row columns inner" role="main">
                        <div class="column-content">
                            <div id="module-news-content" class="module-content clearfix">
    <div class="row columns">
        <div class="column-content">
            <h1>Aktualności</h1>
        </div>
    </div>
    <div class="row columns inner">
        <div class="column-content">
                    </div>
    </div>
        <div class="row columns inner">
        <div class="column-content">
                <div class="row columns">
        <div class="column-content">
                                                <div class="news-box">
                        <div class="col-img">
                                                            <a href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/konferencja-optica-oic-62.html" title="Konferencja Optica OIC" class="photo">
                                    <img src="Aktualno%C5%9Bci%20_%20Zesp%C3%B3%C5%82%20Technologii%20Cienkowarstwowych_files/FABoNM1cPfU9nAkY,whatsapp_image_2025-05-28_at_173825.jpeg" width="362" height="222" alt="" border="0">
                                </a>
                                                    </div>
                        <div class="col-text text-content">
                            <a class="title" href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/konferencja-optica-oic-62.html" title="Konferencja Optica OIC">Konferencja Optica OIC</a>

                            <p class="date">
                                Data: 29.05.2025                                                            </p>
                            <p><a href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/konferencja-optica-oic-62.html" title="więcej" class="more">więcej <i class="fa fa-caret-right"></i></a></p>

                        </div>
                        <div class="clear"></div>
                    </div>
                                                                <div class="news-box">
                        <div class="col-img">
                                                            <a href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/dr-inz-milena-kiliszkiewicz-laureatka-szostej-edycji-konkursu-secundus-60.html" title="dr inż. Milena Kiliszkiewicz laureatką szóstej edycji konkursu Secundus" class="photo">
                                    <img src="Aktualno%C5%9Bci%20_%20Zesp%C3%B3%C5%82%20Technologii%20Cienkowarstwowych_files/FABoNM1cPfU9nAkY,482127614_617903651212615_92060660727820010.jpg" width="362" height="222" alt="" border="0">
                                </a>
                                                    </div>
                        <div class="col-text text-content">
                            <a class="title" href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/dr-inz-milena-kiliszkiewicz-laureatka-szostej-edycji-konkursu-secundus-60.html" title="dr inż. Milena Kiliszkiewicz laureatką szóstej edycji konkursu Secundus">dr inż. Milena Kiliszkiewicz laureatką szóstej edycji konkursu Secundus</a>

                            <p class="date">
                                Data: 25.04.2025                                                            </p>
                            <p><a href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/dr-inz-milena-kiliszkiewicz-laureatka-szostej-edycji-konkursu-secundus-60.html" title="więcej" class="more">więcej <i class="fa fa-caret-right"></i></a></p>

                        </div>
                        <div class="clear"></div>
                    </div>
                                                                <div class="news-box">
                        <div class="col-img">
                                                            <a href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/nauka--cienkie-warstwy-i-fotony-czyli-dzien-otwarty-politechniki-wroclawskiej-61.html" title="Nauka, cienkie warstwy i fotony – czyli Dzień Otwarty Politechniki Wrocławskiej!" class="photo">
                                    <img src="Aktualno%C5%9Bci%20_%20Zesp%C3%B3%C5%82%20Technologii%20Cienkowarstwowych_files/FABoNM1cPfU9nAkY,20250411_112403.jpg" width="362" height="222" alt="" border="0">
                                </a>
                                                    </div>
                        <div class="col-text text-content">
                            <a class="title" href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/nauka--cienkie-warstwy-i-fotony-czyli-dzien-otwarty-politechniki-wroclawskiej-61.html" title="Nauka, cienkie warstwy i fotony – czyli Dzień Otwarty Politechniki Wrocławskiej!">Nauka, cienkie warstwy i fotony – czyli Dzień Otwarty Politechniki Wrocławskiej!</a>

                            <p class="date">
                                Data: 25.04.2025                                                            </p>
                            <p><a href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/nauka--cienkie-warstwy-i-fotony-czyli-dzien-otwarty-politechniki-wroclawskiej-61.html" title="więcej" class="more">więcej <i class="fa fa-caret-right"></i></a></p>

                        </div>
                        <div class="clear"></div>
                    </div>
                                                                <div class="news-box">
                        <div class="col-img">
                                                            <a href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/warsztaty-dla-uczniow-elektronicznych-zakladow-naukowych-59.html" title="Warsztaty dla uczniów Elektronicznych Zakładów Naukowych" class="photo">
                                    <img src="Aktualno%C5%9Bci%20_%20Zesp%C3%B3%C5%82%20Technologii%20Cienkowarstwowych_files/FABoNM1cPfU9nAkY,img_20250313_163758_883.jpg" width="362" height="222" alt="" border="0">
                                </a>
                                                    </div>
                        <div class="col-text text-content">
                            <a class="title" href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/warsztaty-dla-uczniow-elektronicznych-zakladow-naukowych-59.html" title="Warsztaty dla uczniów Elektronicznych Zakładów Naukowych">Warsztaty dla uczniów Elektronicznych Zakładów Naukowych</a>

                            <p class="date">
                                Data: 13.03.2025                                                            </p>
                            <p><a href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/warsztaty-dla-uczniow-elektronicznych-zakladow-naukowych-59.html" title="więcej" class="more">więcej <i class="fa fa-caret-right"></i></a></p>

                        </div>
                        <div class="clear"></div>
                    </div>
                                                                <div class="news-box">
                        <div class="col-img">
                                                            <a href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/spotkanie-projektowe-coco-58.html" title="Spotkanie projektowe Coco" class="photo">
                                    <img src="Aktualno%C5%9Bci%20_%20Zesp%C3%B3%C5%82%20Technologii%20Cienkowarstwowych_files/FABoNM1cPfU9nAkY,group_photo__kopia.jpg" width="362" height="222" alt="" border="0">
                                </a>
                                                    </div>
                        <div class="col-text text-content">
                            <a class="title" href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/spotkanie-projektowe-coco-58.html" title="Spotkanie projektowe Coco">Spotkanie projektowe Coco</a>

                            <p class="date">
                                Data: 04.03.2025                                                            </p>
                            <p><a href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/spotkanie-projektowe-coco-58.html" title="więcej" class="more">więcej <i class="fa fa-caret-right"></i></a></p>

                        </div>
                        <div class="clear"></div>
                    </div>
                                                                <div class="news-box">
                        <div class="col-img">
                                                            <a href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/wizyta-w-agh-57.html" title="Wizyta w AGH" class="photo">
                                    <img src="Aktualno%C5%9Bci%20_%20Zesp%C3%B3%C5%82%20Technologii%20Cienkowarstwowych_files/FABoNM1cPfU9nAkY,20250218_105617.jpg" width="362" height="222" alt="" border="0">
                                </a>
                                                    </div>
                        <div class="col-text text-content">
                            <a class="title" href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/wizyta-w-agh-57.html" title="Wizyta w AGH">Wizyta w AGH</a>

                            <p class="date">
                                Data: 19.02.2025                                                            </p>
                            <p><a href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/wizyta-w-agh-57.html" title="więcej" class="more">więcej <i class="fa fa-caret-right"></i></a></p>

                        </div>
                        <div class="clear"></div>
                    </div>
                                                                <div class="news-box">
                        <div class="col-img">
                                                            <a href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/minigranty-dla-naszych-doktorantek-56.html" title="Minigranty dla naszych doktorantek" class="photo">
                                    <img src="Aktualno%C5%9Bci%20_%20Zesp%C3%B3%C5%82%20Technologii%20Cienkowarstwowych_files/FABoNM1cPfU9nAkY,450726072_448966484773000_70542621224586641.jpg" width="349" height="222" alt="" border="0">
                                </a>
                                                    </div>
                        <div class="col-text text-content">
                            <a class="title" href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/minigranty-dla-naszych-doktorantek-56.html" title="Minigranty dla naszych doktorantek">Minigranty dla naszych doktorantek</a>

                            <p class="date">
                                Data: 06.02.2025                                                            </p>
                            <p><a href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/minigranty-dla-naszych-doktorantek-56.html" title="więcej" class="more">więcej <i class="fa fa-caret-right"></i></a></p>

                        </div>
                        <div class="clear"></div>
                    </div>
                                                                <div class="news-box">
                        <div class="col-img">
                                                            <a href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/nowy-czlonek-api-z-naszego-zespolu-55.html" title="Nowy członek API z naszego Zespołu" class="photo">
                                    <img src="Aktualno%C5%9Bci%20_%20Zesp%C3%B3%C5%82%20Technologii%20Cienkowarstwowych_files/FABoNM1cPfU9nAkY,470170121_1018278417007430_3071401059081092.jpg" width="362" height="222" alt="" border="0">
                                </a>
                                                    </div>
                        <div class="col-text text-content">
                            <a class="title" href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/nowy-czlonek-api-z-naszego-zespolu-55.html" title="Nowy członek API z naszego Zespołu">Nowy członek API z naszego Zespołu</a>

                            <p class="date">
                                Data: 19.12.2024                                                            </p>
                            <p><a href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/nowy-czlonek-api-z-naszego-zespolu-55.html" title="więcej" class="more">więcej <i class="fa fa-caret-right"></i></a></p>

                        </div>
                        <div class="clear"></div>
                    </div>
                                                                <div class="news-box">
                        <div class="col-img">
                                                            <a href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/final-meeting-54.html" title="Final meeting" class="photo">
                                    <img src="Aktualno%C5%9Bci%20_%20Zesp%C3%B3%C5%82%20Technologii%20Cienkowarstwowych_files/FABoNM1cPfU9nAkY,agenda_of_the_final_meeting_1.png" width="362" height="222" alt="" border="0">
                                </a>
                                                    </div>
                        <div class="col-text text-content">
                            <a class="title" href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/final-meeting-54.html" title="Final meeting">Final meeting</a>

                            <p class="date">
                                Data: 12.12.2024                                                            </p>
                            <p><a href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/final-meeting-54.html" title="więcej" class="more">więcej <i class="fa fa-caret-right"></i></a></p>

                        </div>
                        <div class="clear"></div>
                    </div>
                                                                <div class="news-box">
                        <div class="col-img">
                                                            <a href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/grant-z-konkursu-preludium-dla-naszego-zespolu-53.html" title="Grant z konkursu Preludium dla naszego Zespołu" class="photo">
                                    <img src="Aktualno%C5%9Bci%20_%20Zesp%C3%B3%C5%82%20Technologii%20Cienkowarstwowych_files/FABoNM1cPfU9nAkY,ncn.jpg" width="362" height="222" alt="" border="0">
                                </a>
                                                    </div>
                        <div class="col-text text-content">
                            <a class="title" href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/grant-z-konkursu-preludium-dla-naszego-zespolu-53.html" title="Grant z konkursu Preludium dla naszego Zespołu">Grant z konkursu Preludium dla naszego Zespołu</a>

                            <p class="date">
                                Data: 06.12.2024                                                            </p>
                            <p><a href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/grant-z-konkursu-preludium-dla-naszego-zespolu-53.html" title="więcej" class="more">więcej <i class="fa fa-caret-right"></i></a></p>

                        </div>
                        <div class="clear"></div>
                    </div>
                                    </div>
    </div>
        <div class="row columns">
        <div class="column-content">
            <div class="pagination">
                <ul class="pwr-table-pagination">
                    
                                                    
                        
                                                    
                                                                <li>
                                                                                    <a class="current">
                                                <span class="page page-active">1</span>
                                            </a>
                                                                            </li>
                                                                <li>
                                                                                    <a class="not-active" href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/page2.html" title=" 2">
                                                2                                            </a>
                                                                            </li>
                                                                <li>
                                                                                    <a class="not-active" href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/page3.html" title=" 3">
                                                3                                            </a>
                                                                            </li>
                            
                                                            <li class="dots">
                                    <span>...</span>
                                </li>
                                <li>
                                    <a class="not-active" href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/page6.html" title=" 6">
                                        6                                    </a>
                                </li>
                            
                        
                                                    <li>
                                                                    <a class="next" href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci/page2.html" title="Następna strona">Następna</a>
                                                            </li>
                                                            </ul>
            </div>
        </div>
    </div>
        </div>
    </div>
    <div class="row columns inner">
        <div class="column-content">
            <!-- BIP FOOTER -->
            
            <div class="print-remove">
                <div class="clear separator"></div>
                <!-- PRINT -->
                <a title="Drukuj" onclick="window.print()" class="button tiny gray" href="javascript:void(0)">Drukuj</a>
                <!-- SHARE -->
                                <!-- SOCIAL -->
                
                <!-- BACK BUTTON -->
                                <div class="clear"></div>
            </div>
        </div>
    </div>
</div>

                        </div>
                    </div>
                </div>
            </div>
            <div class="column col-25 sidebar">
                <div class="column-content">
                    <div class="block-content">
        <div class="text-content">
    <p><img src="Aktualno%C5%9Bci%20_%20Zesp%C3%B3%C5%82%20Technologii%20Cienkowarstwowych_files/tft-logo.png" alt="Logo TFT" style="display: block; margin-left: auto; margin-right: auto;" width="515" height="264"></p></div></div><div class="row columns">
    <div class="column-content">
        <div class="menu default">
            <div class="block-content">
                    <div class="nav-collapse collapse">
        <ul class="side-menu" role="navigation"><li><a class="first current" href="https://tft.pwr.edu.pl/strona-glowna/aktualnosci" title="Aktualności"><span>Aktualności</span></a></li><li><a class="" href="https://tft.pwr.edu.pl/strona-glowna/o-zespole" title="O Zespole"><span>O Zespole</span></a></li><li><a class="" href="https://tft.pwr.edu.pl/strona-glowna/struktura" title="Struktura"><span>Struktura</span></a></li><li><a class="last" href="https://tft.pwr.edu.pl/strona-glowna/galeria" title="Galeria"><span>Galeria</span></a></li></ul>    </div>
            </div>
        </div>
    </div>
</div><div class="block-content">
    
    <div class="sidebar-box search">
        <div class="pwr-form">
            <i class="close-search fa fa-times"></i>
<div class="clear"></div>
<div id="search">
    <form class="searchForm" action="/wyszukiwarka" method="GET" name="Index" id="searchForm" role="search">

															<input value="XJEB9dYw1YZxZ9AAU4GVMYGBxWUGxqTk1GTmZIUE5UWWVTQwE8Gk8uZihXCD5YSkpLF1sSYGlFXQIeMRZRERdKZAIfWWFMCTVRM1IVcFVeUwZUTgQ-K1EPHFlsABlFVVJ9GEENNwJSO0wiUERxCUsSRxxCEWMJLQsjGBJHeiUnLio3ZEpiBRFsEH0ADiMeFUYfYAkENjoMPAIYdUhQTlZaZVMRWDoSHGgVJUAHc0JGExcXWAA7Oh5NRExvERFAXVxvEAdTJA" id="VALIDATOR_91367" name="_VALIDATOR" type="hidden">			
		
	
				
					<div class="field clearfix text ">
				<label for="query">Szukaj</label><input tabindex="1" placeholder="Wpisz szukaną frazę" class="pwr-input" name="query" id="query" type="text" maxlength="64">                <div class="clear"></div>
			</div>
		
		
	
				
					<div class="field clearfix buttons submit-buttons ">
				<input tabindex="2" class="pwr-btn-submit" type="submit" value="Szukaj">                <div class="clear"></div>
			</div>
		
		
	
				
					<script type="text/javascript">
				//<![CDATA[
					

            ${'$'}(function () {

                ${'$'}('.searchForm').submit(function (e) {

                    ${'$'}(this).find('#input[name="_VALIDATOR"]').remove();

                    var default_action = ${'$'}(this).attr('action');

                    var search_value = ${'$'}(this).find('#query').val();

                    search_value = search_value.replace(/%/g, '');

                    var params = ${'$'}(this).find('#from').val();

                    if (search_value.length >= 3) {

                        if(params){
                            document.location = default_action + '/index.html?query=' + encodeURI(search_value)+'&from='+encodeURI(params);
                        }else{
                            document.location = default_action + '/index.html?query=' + encodeURI(search_value);
                        }
                    }else{
                        ${'$'}(this).children('.pwr-input').css('border', '1px solid #b94a48');
                        ${'$'}(this).parent().find('div.message.error').remove();
                        ${'$'}(this).parent().prepend('<div class="message small absolute error">Minimalna ilość znaków: 3</div>');
                    }
                    e.preventDefault();
                    return false;
                });

            });
        
				//]]>
			</script>		
		
	
				
					
</form>

	
</div>            <div class="clear"></div>
        </div>
    </div>
</div><div class="block-content">
            <h2 class="menu">Ważne linki</h2>
            <div class="row columns inner">
                <ul class="no-bullets">
                                                            <li class="column col-5">
                    <div class="column-content">
                        <a href="http://pwr.edu.pl/" target="_blank" title="Politechnika Wrocławska" class="button-link text-content">
                                                            <div class="ico" style="background-image: url('/thumb/cUQBLFBRVEAVjbwQvGlEfE1oV,271/pl/links/3/1/3/cAE9Ie1RBfgVg,pwr2.png')"></div>
                            
                            <span class="text">Politechnika Wrocławska</span>
                        </a>
                    </div>
                </li>
                                                                            <li class="column col-5">
                    <div class="column-content">
                        <a href="https://wefim.pwr.edu.pl/" target="_blank" title="Wydział Elektroniki, Fotoniki i Mikrosystemów" class="button-link text-content">
                                                            <div class="ico" style="background-image: url('/thumb/8UQBLFBRVEAVjbwNpWk1bE1M,271/pl/links/3/2/3/cAE9Ie1RBfgVg,w12.jpg')"></div>
                            
                            <span class="text">Wydział Elektroniki, Fotoniki i Mikrosystemów</span>
                        </a>
                    </div>
                </li>
                                                                            <li class="column col-5">
                    <div class="column-content">
                        <a href="http://kmeif.pwr.edu.pl/" target="_blank" title="Wydział Elektroniki, Fotoniki i Mikrosystemów" class="button-link text-content">
                                                            <div class="ico" style="background-image: url('/thumb/iUQBLFBRVEAVjbxg3DwxuCAdDXnliHQMF,271/pl/links/3/3/13/cAE9Ie1RBfgVg,logo_k31-1.png')"></div>
                            
                            <span class="text">Katedra Metrologii Elektronicznej i Fotonicznej</span>
                        </a>
                    </div>
                </li>
                                                                            <li class="column col-5">
                    <div class="column-content">
                        <a href="https://iot.pwr.edu.pl/" target="_blank" title="Wydział Elektroniki, Fotoniki i Mikrosystemów" class="button-link text-content">
                                                            <div class="ico" style="background-image: url('/thumb/4UQBLFBRVEAVjbx03HE1BDVM,271/pl/links/3/8/3/cAE9Ie1RBfgVg,iot.png')"></div>
                            
                            <span class="text">Laboratorium Systemów Bezprzewodowych i Internetu Rzeczy</span>
                        </a>
                    </div>
                </li>
                                                                            <li class="column col-5">
                    <div class="column-content">
                        <a href="https://solarlab.pwr.edu.pl/" target="_blank" title="Wydział Elektroniki, Fotoniki i Mikrosystemów" class="button-link text-content">
                                                            <div class="ico" style="background-image: url('/thumb/uUQBLFBRVEAVjbwc3BAJDPAZfQmY8Awo,271/pl/links/3/7/5/cAE9Ie1RBfgVg,solar_2-1.png')"></div>
                            
                            <span class="text">Laboratorium Fotowoltaiki SolarLAB</span>
                        </a>
                    </div>
                </li>
                                                                            <li class="column col-5">
                    <div class="column-content">
                        <a href="https://www.linkedin.com/company/tft-pwr" target="_blank" title="Wydział Elektroniki, Fotoniki i Mikrosystemów" class="button-link text-content">
                                                            <div class="ico" style="background-image: url('/thumb/YUQBLFBRVEAVjbxgxBghUB10cXSI8Cg,271/pl/links/3/5/5/cAE9Ie1RBfgVg,linkedin.jpg')"></div>
                            
                            <span class="text">Linkedin Zespołu</span>
                        </a>
                    </div>
                </li>
                                                                            <li class="column col-5">
                    <div class="column-content">
                        <a href="https://www.facebook.com/TFT.PWR" target="_blank" title="Wydział Elektroniki, Fotoniki i Mikrosystemów" class="button-link text-content">
                                                            <div class="ico" style="background-image: url('/thumb/2UQBLFBRVEAVjbxI6RglBBA,271/pl/links/3/6/4/cAE9Ie1RBfgVg,fb.jpg')"></div>
                            
                            <span class="text">Facebook Zespołu</span>
                        </a>
                    </div>
                </li>
                                    </ul>
        <div class="clear"></div>
    </div>

</div>                </div>
            </div>
            <div class="clear"></div>
        </div>
    </div>

    <div class="clear"></div>

    <footer class="footer">
        <div class="container main-site">
            <div class="row columns">
                <div class="column col-33">
                    <div class="column-content">
                        <div class="row columns">
    <div class="column-content">
        <div class="logo">
                                        <a href="https://tft.pwr.edu.pl/" class="logo" title="Strona główna">
                                                    <svg version="1.1" id="Warstwa_1" xmlns="http://www.w3.org/2000/svg" xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" width="267px" height="60px" viewBox="0 0 267 60" enable-background="new 0 0 267 60" xml:space="preserve">
                        <polygon fill="#1D1D1B" points="57.507,2.063 57.507,56.82 2.757,56.82 3.873,57.938 58.625,57.938 58.625,3.182 "></polygon>
                        <g>
                            <path fill="#1D1D1B" d="M75.32,41.713c0,1.979-1.359,2.967-4.076,2.967c-0.291,0-0.563-0.019-0.854-0.035v-1.709
                                  c0-1.376,0.04-2.679,0.097-3.901c0.407-0.04,0.795-0.056,1.184-0.056C74.175,38.979,75.32,39.673,75.32,41.713 M77.105,41.56
                                  c0-2.097-1.495-3.34-4.249-3.34c-1.165,0-2.212,0.135-3.164,0.135c-0.271,0-0.562-0.019-0.932-0.058
                                  c0.079,2.02,0.119,4.174,0.119,6.498c0,2.215-0.04,4.369-0.119,6.468c0.331-0.061,0.641-0.103,0.951-0.103
                                  c0.272,0,0.525,0.042,0.796,0.082c-0.076-1.358-0.097-2.428-0.097-3.205v-2.718c0.603,0.039,1.106,0.039,1.438,0.039
                                  C75.281,45.358,77.105,43.965,77.105,41.56"></path>
                            <path fill="#1D1D1B" d="M84.672,46.895c0,2.599-1.009,3.959-2.871,3.959c-1.883,0-2.892-1.397-2.892-4.098
                                  c0-2.679,1.009-4.055,2.872-4.055C83.663,42.701,84.672,44.138,84.672,46.895 M86.302,46.777c0-2.756-1.862-4.638-4.501-4.638
                                  c-2.561,0-4.502,1.882-4.502,4.638c0,2.774,1.882,4.657,4.502,4.657C84.381,51.435,86.302,49.611,86.302,46.777"></path>
                            <path fill="#1D1D1B" d="M89.95,51.263c-0.057-1.648-0.078-4.444-0.078-8.376c0-2.151,0-4.094,0.078-5.835
                                  c-0.25,0.02-0.544,0.04-0.815,0.04c-0.232,0-0.504-0.021-0.756-0.04c0.078,1.048,0.078,2.266,0.078,3.704v4.979
                                  c0,2.426,0,4.266-0.078,5.528c0.252-0.045,0.504-0.063,0.756-0.063C89.406,51.199,89.68,51.218,89.95,51.263"></path>
                            <path fill="#1D1D1B" d="M94.491,51.263c-0.058-1.555-0.099-3.13-0.099-4.704c0-1.454,0.041-2.854,0.099-4.252
                                  c-0.233,0.06-0.504,0.078-0.778,0.078c-0.251,0-0.503-0.019-0.775-0.078c0.06,1.376,0.098,2.798,0.098,4.252
                                  c0,1.574-0.038,3.149-0.098,4.704c0.272-0.063,0.524-0.1,0.775-0.1C93.987,51.163,94.258,51.199,94.491,51.263 M94.686,39.016
                                  c0-0.544-0.428-0.951-0.973-0.951c-0.522,0-0.969,0.407-0.969,0.951c0,0.523,0.447,0.951,0.969,0.951
                                  C94.258,39.967,94.686,39.539,94.686,39.016"></path>
                            <path fill="#1D1D1B" d="M101.865,50.813l-0.136-0.428c-0.542,0.272-0.989,0.408-1.319,0.408c-1.202,0-1.589-0.738-1.589-2.41
                                  c0-1.726,0.076-3.184,0.076-4.39c0-0.096,0.019-0.425,0.039-0.948c0.194-0.021,0.426-0.021,0.679-0.021
                                  c0.484,0,1.066,0.021,1.746,0.057v-0.153c0-0.232,0.02-0.444,0.059-0.621c-0.95,0.077-1.765,0.099-2.464,0.099v-1.24
                                  c0-0.193,0.02-0.679,0.057-1.493c-0.446,0.216-0.949,0.371-1.531,0.468c0.019,0.5,0.037,1.025,0.037,1.586v0.64
                                  c-0.386,0-0.813-0.021-1.203-0.059l0.02,0.292c0,0.152-0.02,0.329-0.04,0.503c0.331-0.038,0.661-0.057,0.993-0.057h0.193v0.638
                                  c0,2.489-0.099,4.216-0.099,5.167c0,1.789,0.661,2.607,2.426,2.607C100.526,51.458,101.244,51.221,101.865,50.813"></path>
                            <path fill="#1D1D1B" d="M108.87,46h-4.987c0.076-2.039,1.202-3.298,2.619-3.298c1.456,0,2.368,1.087,2.368,2.988V46z
                                  M110.403,46.253c0-2.657-1.417-4.132-3.822-4.132c-2.641,0-4.367,1.861-4.367,4.675c0,2.736,1.804,4.644,4.483,4.644
                                  c1.162,0,2.229-0.375,3.221-1.089v-0.234c0-0.213,0.018-0.468,0.039-0.718c-0.893,0.871-1.824,1.28-2.932,1.28
                                  c-2.057,0-3.182-1.379-3.182-3.962v-0.058h6.539L110.403,46.253z"></path>
                            <path fill="#1D1D1B" d="M119.581,42.896c-0.989-0.506-2.018-0.758-3.084-0.758c-2.835,0-4.714,1.845-4.714,4.657
                                  c0,2.833,1.802,4.66,4.442,4.66c1.338,0,2.386-0.296,3.24-0.954l-0.02-0.386c0-0.195,0.02-0.428,0.039-0.7
                                  c-0.912,0.933-1.804,1.378-2.872,1.378c-1.96,0-3.298-1.515-3.298-4.017c0-2.583,1.185-4.036,3.184-4.036
                                  c1.183,0,2.036,0.582,2.581,1.786C119.194,43.925,119.369,43.363,119.581,42.896"></path>
                            <path fill="#1D1D1B" d="M128.837,51.263c-0.038-1.263-0.076-2.235-0.076-2.915c0-1.125,0.056-2.095,0.056-2.911
                                  c0-2.189-1.009-3.297-3.028-3.297c-1.26,0-2.132,0.523-2.949,1.726c0-0.912-0.017-1.786-0.017-2.593
                                  c0-1.226,0.017-2.638,0.056-4.221c-0.233,0.04-0.503,0.079-0.777,0.079c-0.233,0-0.504-0.039-0.796-0.079
                                  c0.059,2.224,0.099,4.582,0.099,7.086c0,1.319-0.02,3.688-0.099,7.125c0.256-0.063,0.507-0.099,0.758-0.099
                                  c0.272,0,0.544,0.035,0.795,0.099c-0.019-1.033-0.036-1.77-0.036-2.217v-1.356c0-1.592,0.036-2.698,0.366-3.356
                                  c0.428-0.816,1.145-1.242,2.039-1.242c1.609,0,2.154,0.99,2.154,3.123c0,1.26-0.039,2.947-0.098,5.049
                                  c0.272-0.063,0.524-0.099,0.777-0.099C128.333,51.164,128.604,51.199,128.837,51.263"></path>
                            <path fill="#1D1D1B" d="M139.18,51.263c-0.037-1.072-0.059-2.059-0.059-2.993c0-0.89,0.041-1.82,0.041-2.757
                                  c0-2.266-1.01-3.392-3.029-3.392c-1.281,0-2.25,0.598-2.967,1.844c0-0.233-0.021-0.467-0.021-0.7c0-0.312,0.021-0.622,0.04-0.952
                                  c-0.232,0.06-0.485,0.078-0.757,0.078c-0.233,0-0.504-0.019-0.777-0.078c0.078,1.341,0.078,2.757,0.078,4.309v1.337
                                  c0,1.146,0,2.232-0.078,3.305c0.273-0.063,0.525-0.099,0.777-0.099c0.271,0,0.543,0.035,0.794,0.099
                                  c-0.037-0.974-0.037-2.137-0.037-3.556v-0.852c0-1.263,0.037-2.216,0.641-2.951c0.427-0.563,1.027-0.813,1.763-0.813
                                  c1.439,0,2.154,0.931,2.154,2.795c0,2.248-0.037,4.055-0.113,5.377c0.27-0.063,0.523-0.099,0.773-0.099
                                  C138.656,51.164,138.928,51.199,139.18,51.263"></path>
                            <path fill="#1D1D1B" d="M143.719,51.263c-0.057-1.555-0.096-3.13-0.096-4.704c0-1.454,0.039-2.854,0.096-4.252
                                  c-0.23,0.06-0.502,0.078-0.775,0.078c-0.25,0-0.504-0.019-0.775-0.078c0.059,1.376,0.098,2.798,0.098,4.252
                                  c0,1.574-0.039,3.149-0.098,4.704c0.271-0.063,0.525-0.1,0.775-0.1C143.217,51.163,143.488,51.199,143.719,51.263 M143.914,39.016
                                  c0-0.544-0.426-0.951-0.971-0.951c-0.521,0-0.969,0.407-0.969,0.951c0,0.523,0.447,0.951,0.969,0.951
                                  C143.488,39.967,143.914,39.539,143.914,39.016"></path>
                            <path fill="#1D1D1B" d="M154.471,51.263c-1.707-2.023-3.201-3.753-4.465-5.228l1.709-1.613c1.029-0.968,1.824-1.688,2.465-2.114
                                  c-0.271,0.038-0.563,0.06-0.834,0.06c-0.273,0-0.545-0.021-0.834-0.06c-2.078,2.641-3.611,3.864-3.961,3.864
                                  c-0.213,0-0.311-0.116-0.311-0.333V45.2c0-2.37,0.021-5.073,0.098-8.148c-0.252,0.04-0.523,0.079-0.795,0.079
                                  c-0.252,0-0.523-0.039-0.795-0.079c0.078,2.397,0.098,4.755,0.098,7.08c0,1.826-0.02,4.192-0.098,7.131
                                  c0.271-0.063,0.543-0.099,0.795-0.099c0.271,0,0.543,0.035,0.795,0.099c-0.098-1.479-0.098-2.621-0.098-3.384v-1.066
                                  c0-0.176,0-0.254,0.178-0.254c0.291,0,1.666,1.535,4.016,4.704c0.311-0.063,0.639-0.083,0.969-0.083
                                  C153.754,51.18,154.121,51.199,154.471,51.263"></path>
                            <path fill="#1D1D1B" d="M160.641,49.008c0,0.271-0.02,0.504-0.326,0.814c-0.508,0.507-1.283,0.836-1.904,0.836
                                  c-1.049,0-1.688-0.658-1.688-1.805c0-1.496,1.184-1.843,3.918-2.288V49.008z M163.223,50.947l-0.078-0.367l-0.33,0.021
                                  c-0.719,0-0.836-0.352-0.836-1.264v-0.522l0.08-3.241v-0.232c0-2.155-0.834-3.182-2.99-3.182c-1.182,0-2.25,0.369-3.066,1.065
                                  l-0.037,0.991h0.156c0.582-0.896,1.395-1.342,2.443-1.342c1.535,0,2.115,0.817,2.115,2.482v0.407
                                  c-0.484,0.429-1.629,0.507-3.297,0.856c-1.494,0.333-2.213,1.125-2.213,2.486c0,1.473,0.93,2.332,2.617,2.332
                                  c1.088,0,2.039-0.452,2.834-1.288c0.119,0.761,0.389,1.109,1.049,1.109C162.213,51.261,162.697,51.104,163.223,50.947"></path>
                            <path fill="#1D1D1B" d="M187.227,38.298c-0.213,0.057-0.428,0.077-0.641,0.077s-0.406-0.021-0.604-0.077
                                  c-0.951,3.707-2.055,7.373-3.297,10.963c-1.34-3.687-2.541-7.354-3.646-10.963c-0.215,0.057-0.428,0.077-0.625,0.077
                                  c-0.211,0-0.406-0.021-0.619-0.077c-1.066,3.919-2.27,7.623-3.551,11.156c-1.242-3.841-2.328-7.567-3.299-11.156
                                  c-0.291,0.057-0.602,0.077-0.895,0.077c-0.311,0-0.619-0.021-0.91-0.077c1.475,4.616,2.834,8.924,4.057,12.964
                                  c0.232-0.06,0.445-0.102,0.658-0.102c0.232,0,0.447,0.042,0.66,0.102c0.563-1.556,1.727-5.087,3.551-10.597
                                  c1.301,3.608,2.482,7.138,3.492,10.617c0.234-0.08,0.447-0.101,0.68-0.101c0.234,0,0.447,0.021,0.658,0.08
                                  C184.316,47.029,185.73,42.723,187.227,38.298"></path>
                            <path fill="#1D1D1B" d="M192.523,42.313c-0.311-0.056-0.543-0.096-0.717-0.096c-0.934,0-1.689,0.736-2.369,2.176
                                  c0-0.778,0.039-1.478,0.098-2.08c-0.254,0.06-0.525,0.077-0.797,0.077c-0.25,0-0.523-0.018-0.814-0.077
                                  c0.08,0.816,0.096,1.73,0.096,2.737c0,2.774-0.039,4.851-0.096,6.192c0.252-0.043,0.486-0.061,0.719-0.061
                                  c0.271,0,0.563,0.018,0.834,0.081c-0.059-0.856-0.098-2.137-0.098-3.827c0-2.578,0.545-3.842,1.98-3.842
                                  c0.311,0,0.602,0.077,0.91,0.253l0.156-0.098C192.426,43.207,192.445,42.701,192.523,42.313"></path>
                            <path fill="#1D1D1B" d="M200.789,46.895c0,2.599-1.01,3.959-2.869,3.959c-1.885,0-2.895-1.397-2.895-4.098
                                  c0-2.679,1.01-4.055,2.873-4.055C199.779,42.701,200.789,44.138,200.789,46.895 M202.42,46.777c0-2.756-1.863-4.638-4.5-4.638
                                  c-2.564,0-4.504,1.882-4.504,4.638c0,2.774,1.881,4.657,4.504,4.657C200.498,51.435,202.42,49.611,202.42,46.777"></path>
                            <path fill="#1D1D1B" d="M211.541,42.896c-0.992-0.506-2.02-0.758-3.086-0.758c-2.834,0-4.717,1.845-4.717,4.657
                                  c0,2.833,1.805,4.66,4.445,4.66c1.338,0,2.385-0.296,3.238-0.954l-0.02-0.386c0-0.195,0.02-0.428,0.041-0.7
                                  c-0.914,0.933-1.805,1.378-2.871,1.378c-1.961,0-3.301-1.515-3.301-4.017c0-2.583,1.184-4.036,3.184-4.036
                                  c1.184,0,2.037,0.582,2.582,1.786C211.152,43.925,211.328,43.363,211.541,42.896"></path>
                            <path fill="#1D1D1B" d="M216.217,41.897v-1.005c-0.273,0.232-0.719,0.615-1.377,1.082v-0.216c0-1.801,0.039-3.503,0.096-4.706
                                  c-0.252,0.019-0.541,0.038-0.816,0.038c-0.23,0-0.504-0.02-0.756-0.038c0.076,1.566,0.098,3.351,0.098,5.367v0.502
                                  c-0.561,0.391-0.738,0.508-1.32,0.855v0.988c0.816-0.66,1.223-1.008,1.299-1.044v2.749c0,2.096-0.035,3.681-0.076,4.792
                                  c0.252-0.042,0.504-0.064,0.756-0.064c0.275,0,0.543,0.022,0.816,0.064c-0.057-1.207-0.096-3.941-0.096-8.491
                                  C215.42,42.402,215.576,42.286,216.217,41.897"></path>
                            <path fill="#1D1D1B" d="M222.58,49.008c0,0.271-0.021,0.504-0.328,0.814c-0.504,0.507-1.281,0.836-1.902,0.836
                                  c-1.049,0-1.689-0.658-1.689-1.805c0-1.496,1.184-1.843,3.92-2.288V49.008z M225.164,50.947l-0.08-0.367l-0.328,0.021
                                  c-0.723,0-0.836-0.352-0.836-1.264v-0.522l0.076-3.241v-0.232c0-2.155-0.834-3.182-2.986-3.182c-1.186,0-2.252,0.369-3.068,1.065
                                  l-0.037,0.991h0.154c0.584-0.896,1.398-1.342,2.447-1.342c1.533,0,2.113,0.817,2.113,2.482v0.407
                                  c-0.484,0.429-1.631,0.507-3.299,0.856c-1.494,0.333-2.211,1.125-2.211,2.486c0,1.473,0.93,2.332,2.617,2.332
                                  c1.088,0,2.037-0.452,2.832-1.288c0.121,0.761,0.391,1.109,1.053,1.109C224.152,51.261,224.637,51.104,225.164,50.947"></path>
                            <path fill="#1D1D1B" d="M239.539,42.307c-0.174,0.021-0.367,0.039-0.563,0.039c-0.193,0-0.365-0.018-0.58-0.039
                                  c-1.186,3.477-2.098,5.788-2.641,6.915c-0.6-1.227-1.453-3.534-2.365-6.915c-0.195,0.039-0.389,0.061-0.564,0.061
                                  c-0.174,0-0.369-0.021-0.563-0.061c-0.719,2.526-1.533,4.835-2.484,6.938c-1.26-3.244-2.037-5.561-2.365-6.938
                                  c-0.293,0.061-0.584,0.078-0.855,0.078c-0.291,0-0.563-0.018-0.834-0.078c1.824,4.428,2.93,7.422,3.299,8.956
                                  c0.193-0.042,0.35-0.042,0.541-0.042c0.178,0,0.371,0,0.545,0.042c0.387-1.633,1.166-3.926,2.389-6.86
                                  c1.455,3.885,2.209,6.159,2.326,6.86c0.195-0.042,0.367-0.061,0.545-0.061c0.193,0,0.387,0.019,0.582,0.061
                                  C236.416,49.493,237.678,46.541,239.539,42.307"></path>
                            <path fill="#1D1D1B" d="M245.848,48.446c0-1.185-0.582-1.804-1.826-2.174l-1.299-0.387c-0.971-0.293-1.436-0.719-1.436-1.592
                                  c0-0.952,0.658-1.593,1.609-1.593c0.758,0,1.475,0.428,2.193,1.264c0.078-0.41,0.211-0.796,0.408-1.206
                                  c-0.641-0.387-1.455-0.619-2.369-0.619c-1.785,0-2.91,1.107-2.91,2.617c0,1.341,0.621,2.039,2.059,2.449l0.873,0.25
                                  c1.01,0.271,1.496,0.657,1.496,1.553c0,1.067-0.721,1.726-1.848,1.726c-0.91,0-1.688-0.482-2.307-1.455
                                  c-0.117,0.486-0.273,0.973-0.467,1.475c0.66,0.445,1.512,0.686,2.465,0.686C244.508,51.439,245.848,50.134,245.848,48.446"></path>
                            <path fill="#1D1D1B" d="M255.49,51.263c-1.707-2.023-3.201-3.753-4.463-5.228l1.707-1.613c1.029-0.968,1.826-1.688,2.465-2.114
                                  c-0.271,0.038-0.563,0.06-0.834,0.06c-0.273,0-0.543-0.021-0.834-0.06c-2.078,2.641-3.609,3.864-3.959,3.864
                                  c-0.215,0-0.313-0.116-0.313-0.333V45.2c0-2.37,0.021-5.073,0.098-8.148c-0.25,0.04-0.521,0.079-0.795,0.079
                                  c-0.25,0-0.523-0.039-0.795-0.079c0.078,2.397,0.098,4.755,0.098,7.08c0,1.826-0.02,4.192-0.098,7.131
                                  c0.271-0.063,0.545-0.099,0.795-0.099c0.273,0,0.545,0.035,0.795,0.099c-0.098-1.479-0.098-2.621-0.098-3.384v-1.066
                                  c0-0.176,0-0.254,0.178-0.254c0.291,0,1.668,1.535,4.016,4.704c0.311-0.063,0.639-0.083,0.971-0.083
                                  C254.773,51.18,255.145,51.199,255.49,51.263"></path>
                            <path fill="#1D1D1B" d="M261.66,49.008c0,0.271-0.018,0.504-0.326,0.814c-0.508,0.507-1.283,0.836-1.902,0.836
                                  c-1.051,0-1.689-0.658-1.689-1.805c0-1.496,1.184-1.843,3.918-2.288V49.008z M264.242,50.947l-0.078-0.367l-0.328,0.021
                                  c-0.719,0-0.836-0.352-0.836-1.264v-0.522l0.078-3.241v-0.232c0-2.155-0.834-3.182-2.99-3.182c-1.182,0-2.248,0.369-3.066,1.065
                                  l-0.037,0.991h0.154c0.584-0.896,1.402-1.342,2.447-1.342c1.533,0,2.113,0.817,2.113,2.482v0.407
                                  c-0.484,0.429-1.631,0.507-3.301,0.856c-1.492,0.333-2.209,1.125-2.209,2.486c0,1.473,0.93,2.332,2.619,2.332
                                  c1.086,0,2.039-0.452,2.834-1.288c0.117,0.761,0.387,1.109,1.051,1.109C263.232,51.261,263.719,51.104,264.242,50.947"></path>
                            <path fill="#1D1D1B" d="M40.497,17.08c-0.348,0-0.635,0.303-0.635,0.672c0,0.37,0.287,0.668,0.635,0.668
                                  c0.349,0,0.636-0.298,0.636-0.668C41.133,17.383,40.846,17.08,40.497,17.08"></path>
                            <path fill="#1D1D1B" d="M40.467,18.78h-0.104c-0.468,4.713-4.289,9.757-9.4,9.919l0.001,1.782
                                  C37.278,30.083,40.341,25.138,40.467,18.78"></path>
                            <path fill="#1D1D1B" d="M33.309,16.719c-0.028-0.464-1.049-0.24-1.388,0.083c-0.157,0.147-0.221,0.337-0.313,0.526
                                  c0.014,0.037,0.1-0.042,0.286-0.098c0.306-0.094,0.843,0.008,1.007-0.19C33.015,16.909,33.158,16.79,33.309,16.719"></path>
                            <path fill="#1D1D1B" d="M39.333,18.262c-0.351,0-0.635,0.3-0.635,0.667c0,0.371,0.284,0.674,0.635,0.674
                                  c0.349,0,0.634-0.303,0.634-0.674C39.966,18.563,39.682,18.262,39.333,18.262"></path>
                            <path fill="#1D1D1B" d="M41.483,19.794c0.349,0,0.635-0.303,0.635-0.67c0-0.368-0.286-0.67-0.635-0.67
                                  c-0.35,0-0.635,0.302-0.635,0.67C40.849,19.492,41.134,19.794,41.483,19.794"></path>
                            <path fill="#1D1D1B" d="M30.962,16.563c0.408-0.215,0.738-0.406,1.176-0.532c0.293-0.081,0.608-0.174,0.918-0.14
                                  c0.45,0.043,0.616,0.346,0.568,0.663c0.398-0.212,1.147-0.332,1.509-0.002c0.346,0.316,0.416,0.834,0.302,1.265
                                  c-0.403-0.433-0.921-0.542-1.468-0.272c-0.41,0.198-0.75,0.551-0.937,0.967c0.175,0.2,0.745,0.037,0.939-0.06
                                  c0.214-0.113,0.405-0.294,0.647-0.557c-0.031,0.392-0.079,0.753-0.22,0.945c-0.269,0.364-0.537,0.439-0.992,0.599
                                  c-0.355,0.122-0.718,0.295-1.07,0.654c-0.306,0.404-0.383,1.107-0.29,1.702c0.102,0.66,0.344,1.351,0.549,2.032
                                  c0.204,0.68,0.367,1.351,0.32,1.963c1.048,0.167,2.729-0.998,3.321-1.474c0.654-0.531,1.326-1.144,1.65-1.742
                                  c0.264-0.488,0.342-1.479-0.155-2.25c-0.94-1.466-0.426-3.826,1.565-4.428c1.222-0.356,2.902-0.015,3.657,1.35
                                  c0.736,1.325,0.904,2.819,0.883,4.389c-0.034,2.4-0.131,3.893,0.314,5.683c0.22,0.876,0.63,1.686,1.278,2.432
                                  c-0.509,0.605-1.362,0.188-2.018-0.372c-0.971-0.828-1.799-2.698-2.333-5.709l-0.102,0.372c-0.025,1.812,0.211,3.198,0.604,4.816
                                  c0.396,1.634,0.972,2.589,2.376,3.664c-0.771,0.693-1.549,0.394-2.228-0.124c-1.351-1.027-1.932-2.195-2.485-4.556l-0.1,0.131
                                  c-0.119,1.386,0.027,2.759,0.472,4.003c0.424,1.188,1.247,2.327,2.305,3.195c-0.718,0.649-1.503,0.219-2.155-0.254
                                  c-0.925-0.668-2.301-1.959-2.74-4.492l-0.115,0.099c-0.047,1.451,0.089,2.754,0.4,3.874c0.32,1.145,1.289,2.505,2.264,3.158
                                  c-0.812,0.688-1.544,0.266-2.139-0.192c-1.577-1.212-2.57-2.928-2.932-5.202l-0.143,0.067c-0.168,2.476-0.157,5.189,2.06,6.776
                                  l-0.88,0.549l0.514,0.876c0.227,0.384,2.278-0.666,3.113,0c0.336,0.268,0.551,0.699,0.31,1.246l-0.051-0.021
                                  c-0.021-0.386-0.217-0.59-0.472-0.695c-0.372-0.154-0.94-0.11-1.364,0.375c-0.824,0.558-1.404,0.161-1.83,0.72
                                  c-0.252,0.328-0.246,0.618-0.14,0.944l-0.041,0.024c-1.136-0.593-0.076-1.69-0.286-2.06l-0.552-0.966l-0.887,0.535
                                  c-0.082-0.646-1.094-4.1-1.706-4.332c-0.157,0.228-0.149,0.831-0.172,1.247c-0.032,0.581,0.234,1.007,0.176,1.819
                                  c-0.026,0.351-0.203,0.841-0.485,1.326c0.278,0.182,0.404,0.467,0.397,0.798c-0.007,0.374-0.174,0.809-0.289,1.158
                                  c-0.151,0.455-0.279,0.799-0.109,0.799c0.486-0.253,0.943-0.299,1.336-0.186c0.567,0.165,0.928,0.707,1.44,0.97
                                  c0.594,0.305,1.099,0.251,1.778,0.511c-0.927,0.357-1.059,1.303-2.316,1.105c-0.758-0.117-1.892-1.547-2.098-1.428
                                  c-0.146,0.423-0.051,0.916,0.03,1.586c0.039,0.329,0.079,0.709,0.081,1.139c0.002,0.433-0.027,0.924-0.122,1.477
                                  c-0.127,0.744-0.395,1.696-0.828,2.711h0.01c16.974-5.676,17.101-29.44,17.242-37.055H30.961L30.962,16.563z"></path>
                            <path fill="#1D1D1B" d="M11.001,9.226h-0.08l3.394,42.007h0.153V10.34C13.159,11.272,11.586,10.862,11.001,9.226"></path>
                            <path fill="#1D1D1B" d="M13.644,6.533v0.069c1.562,0.655,2.015,2.541,0.824,3.738h33.755v-0.156L13.644,6.533z"></path>
                            <path fill="#1D1D1B" d="M30.316,17.329c-0.014,0.035-0.101-0.042-0.287-0.099c-0.305-0.092-0.842,0.006-1.008-0.192
                                  c-0.114-0.127-0.258-0.248-0.407-0.32c0.026-0.463,1.049-0.239,1.388,0.084C30.158,16.95,30.223,17.141,30.316,17.329
                                  M30.957,30.479c-6.312-0.396-9.375-5.341-9.5-11.699h0.103c0.467,4.713,4.29,9.757,9.397,9.919V30.479z M20.79,17.754
                                  c0-0.371,0.286-0.674,0.634-0.674c0.35,0,0.635,0.303,0.635,0.674c0,0.368-0.286,0.668-0.635,0.668
                                  C21.076,18.422,20.79,18.122,20.79,17.754 M20.439,19.794c-0.349,0-0.633-0.303-0.633-0.671c0-0.367,0.284-0.669,0.633-0.669
                                  s0.633,0.302,0.633,0.669C21.072,19.492,20.789,19.794,20.439,19.794 M22.59,18.259c0.35,0,0.635,0.302,0.635,0.67
                                  c0,0.372-0.285,0.674-0.635,0.674c-0.348,0-0.633-0.302-0.633-0.674C21.958,18.561,22.242,18.259,22.59,18.259 M28.867,15.89
                                  c-0.45,0.044-0.617,0.347-0.568,0.664c-0.399-0.213-1.149-0.332-1.51-0.004c-0.345,0.318-0.416,0.833-0.3,1.267
                                  c0.403-0.433,0.921-0.541,1.468-0.271c0.409,0.196,0.75,0.55,0.937,0.965c-0.178,0.201-0.745,0.04-0.942-0.059
                                  c-0.216-0.113-0.404-0.294-0.645-0.557c0.03,0.392,0.078,0.753,0.219,0.945c0.27,0.365,0.535,0.439,0.994,0.598
                                  c0.356,0.123,0.715,0.296,1.068,0.655c0.307,0.405,0.383,1.108,0.29,1.702c-0.104,0.66-0.345,1.35-0.548,2.034
                                  c-0.204,0.678-0.37,1.348-0.321,1.962c-1.046,0.167-2.73-1-3.32-1.476c-0.655-0.529-1.326-1.143-1.653-1.741
                                  c-0.262-0.488-0.339-1.478,0.156-2.251c0.941-1.466,0.427-3.827-1.565-4.428c-1.222-0.356-2.902-0.015-3.657,1.35
                                  c-0.735,1.325-0.904,2.819-0.882,4.391c0.034,2.399,0.131,3.892-0.317,5.681c-0.217,0.876-0.628,1.688-1.278,2.431
                                  c0.509,0.604,1.362,0.189,2.021-0.37c0.97-0.831,1.799-2.702,2.333-5.708l0.102,0.371c0.024,1.813-0.211,3.198-0.604,4.817
                                  c-0.396,1.633-0.973,2.588-2.376,3.663c0.771,0.693,1.547,0.394,2.227-0.123c1.352-1.03,1.933-2.196,2.485-4.558l0.1,0.133
                                  c0.116,1.385-0.029,2.758-0.471,4.002c-0.425,1.188-1.247,2.328-2.307,3.196c0.719,0.649,1.505,0.219,2.156-0.256
                                  c0.922-0.666,2.298-1.958,2.74-4.49l0.115,0.098c0.047,1.451-0.087,2.753-0.4,3.876c-0.32,1.143-1.29,2.504-2.266,3.156
                                  c0.814,0.688,1.546,0.266,2.14-0.192c1.58-1.211,2.569-2.929,2.933-5.202l0.14,0.068c0.172,2.474,0.16,5.188-2.057,6.774
                                  l0.879,0.55l-0.513,0.876c-0.229,0.384-2.279-0.666-3.114,0c-0.336,0.267-0.552,0.699-0.309,1.245l0.05-0.021
                                  c0.021-0.386,0.217-0.589,0.473-0.693c0.371-0.156,0.939-0.113,1.362,0.374c0.823,0.557,1.404,0.158,1.831,0.717
                                  c0.25,0.33,0.246,0.62,0.139,0.943l0.041,0.027c1.137-0.593,0.078-1.69,0.286-2.06l0.552-0.967l0.889,0.536
                                  c0.08-0.649,1.093-4.099,1.703-4.332c0.159,0.225,0.148,0.831,0.172,1.248c0.034,0.58-0.234,1.004-0.173,1.818
                                  c0.024,0.351,0.202,0.839,0.484,1.325c-0.279,0.184-0.405,0.468-0.398,0.8c0.009,0.374,0.175,0.808,0.289,1.157
                                  c0.149,0.454,0.28,0.799,0.109,0.799c-0.486-0.254-0.943-0.299-1.335-0.186c-0.571,0.164-0.928,0.706-1.443,0.97
                                  c-0.592,0.306-1.098,0.252-1.775,0.513c0.924,0.352,1.059,1.3,2.314,1.104c0.757-0.117,1.891-1.548,2.098-1.427
                                  c0.145,0.42,0.051,0.914-0.029,1.586c-0.04,0.328-0.08,0.706-0.081,1.141c-0.006,0.43,0.026,0.921,0.121,1.474
                                  c0.125,0.744,0.386,1.699,0.819,2.71h0.009l0.01-34.67c-0.408-0.213-0.739-0.404-1.179-0.531
                                  C29.493,15.949,29.175,15.857,28.867,15.89"></path>
                        </g>
                    </svg>

                                                </a>
                    </div>
    </div>
</div>                    </div>
                </div>
                <div class="column col-33">
                    <div class="column-content footer-content">
                        <p>Wybrzeże Wyspiańskiego 27<br>50-372 Wrocław</p>                    </div>
                </div>
                <div class="column col-33 socials">
                    <div class="column-content" style="display: flex; align-items: center;">
        Znajdź nas:                                                                            <a href="https://www.linkedin.com/company/tft-pwr/" class="social" title="Linkedin">
                <span class="social-text">Linkedin</span><i class="fa fa-linkedin"></i>
            </a>
                    <div class="clear"></div>
</div>                </div>
                <div class="clear"></div>
            </div>
        </div>
    </footer>

    <div class="credits">
        <div class="container">
            Politechnika Wrocławska © 2025        </div>
    </div>

    

<div id="cboxOverlay" style="display: none;"></div><div id="colorbox" class="" role="dialog" aria-hidden="true" aria-labelledby="cboxTitle" aria-describedby="cboxCurrent" style="display: none;"><div id="cboxWrapper"><div><div id="cboxTopLeft" style="float: left;"></div><div id="cboxTopCenter" style="float: left;"></div><div id="cboxTopRight" style="float: left;"></div></div><div style="clear: left;"><div id="cboxMiddleLeft" style="float: left;"></div><div id="cboxContent" style="float: left;"><div id="cboxTitle" aria-live="polite" style="float: left;"></div><div id="cboxCurrent" style="float: left;"></div><button type="button" id="cboxPrevious" aria-hidden="true">previous</button><button type="button" id="cboxNext" aria-hidden="true">next</button><button type="button" id="cboxSlideshow" aria-hidden="true">start slideshow</button><div id="cboxLoadingOverlay" style="float: left;"></div><div id="cboxLoadingGraphic" style="float: left;"></div></div><div id="cboxMiddleRight" style="float: left;"></div></div><div style="clear: left;"><div id="cboxBottomLeft" style="float: left;"></div><div id="cboxBottomCenter" style="float: left;"></div><div id="cboxBottomRight" style="float: left;"></div></div></div><div style="position: absolute; width: 9999px; visibility: hidden; display: none; max-width: none;"></div></div><div style="display: block;" id="dfd-root"><link rel="stylesheet" type="text/css" href="Aktualno%C5%9Bci%20_%20Zesp%C3%B3%C5%82%20Technologii%20Cienkowarstwowych_files/content.css"></div></body></html>
"""