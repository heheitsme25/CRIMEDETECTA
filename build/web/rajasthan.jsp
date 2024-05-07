<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Crime-Prone Areas in Rajasthan</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
        }
        .map-container {
            position: relative;
            width: 100%;
            height: 800px; /* Adjust height as needed */
            background-image: url('css/rajasthan_map.png'); /* Your Rajasthan map image */
            background-size: cover;
            background-position: center;
        }
        .marker {
            position: absolute;
            width: 20px;
            height: 20px;
            border-radius: 50%;
            cursor: pointer;
            transform: translate(-50%, -50%); /* Center the marker */
        }
        /* Red markers */
        .red-marker {
            background-color: red;
        }
        /* Black markers */
        .black-marker {
            background-color: black;
        }
        /* Pink markers */
        .pink-marker {
            background-color: pink;
        }
        /* Green markers */
        .green-marker {
            background-color: green;
        }
        /* Blue markers */
        .blue-marker {
            background-color: blue;
        }
        /* Adjust coordinates for each marker */
        /* Example: */
        .alwar {
            top: 25%; /* Adjust according to latitude */
            left: 48%; /* Adjust according to longitude */
        }
        .deeg {
            top: 26%; 
            left: 47%; 
        }
        .kaman {
            top: 26%; 
            left: 48%; 
        }
        .south-region {
            top: 33%; 
            left: 47%; 
        }
        .jodhpur {
            top: 40%; 
            left: 56%; 
        }
        .kuchera {
            top: 30%; 
            left: 55%; 
        }
        /* Add more marker classes and adjust coordinates as needed */
    </style>
</head>
<body>
    <div class="map-container">
        <!-- Markers for specified areas -->
        <!-- Red markers -->
        <div class="marker red-marker alwar" title="Alwar"></div>
        <div class="marker red-marker deeg" title="Bharatpur - Deeg"></div>
        <div class="marker red-marker kaman" title="Bharatpur - Kaman"></div>
        <div class="marker red-marker south-region" title="Jaipur - South Region"></div>
        <div class="marker red-marker jodhpur" title="Jodhpur"></div>
        <div class="marker red-marker kuchera" title="Nagaur - Kuchera"></div>

        <!-- Black markers -->
        <div class="marker black-marker bansur" title="Alwar - Bansur"></div>
        <div class="marker black-marker halena" title="Bharatpur - Halena"></div>
        <div class="marker black-marker pipar" title="Jodhpur - Pipar"></div>
        <div class="marker black-marker niwai" title="Jaipur - Niwai"></div>
        <div class="marker black-marker khunkhuna" title="Nagaur - Khunkhuna"></div>

        <!-- Pink markers -->
        <div class="marker pink-marker behror" title="Alwar - Behror"></div>
        <div class="marker pink-marker bharatpur" title="Bharatpur - Bharatpur"></div>
        <div class="marker pink-marker sardarpura" title="Jodhpur - Sardarpura"></div>
        <div class="marker pink-marker kaladera" title="Jaipur - Kaladera"></div>
        <div class="marker pink-marker nagaur" title="Nagaur - Nagaur"></div>

        <!-- Green markers -->
        <div class="marker green-marker shahjahanpur" title="Alwar - Shahjahanpur"></div>
        <div class="marker green-marker kachhpura" title="Bharatpur - Kachhpura"></div>
        <div class="marker green-marker pawanpuri" title="Jodhpur - Pawanpuri"></div>
        <div class="marker green-marker sindhi-camp" title="Jaipur - Sindhi Camp"></div>
        <div class="marker green-marker ganesh-nagar" title="Nagaur - Ganesh Nagar"></div>

        <!-- Blue markers -->
        <div class="marker blue-marker sariska" title="Alwar - Sariska"></div>
        <div class="marker blue-marker keoladeo-national-park" title="Bharatpur - Keoladeo National Park"></div>
        <div class="marker blue-marker mehrangarh-fort" title="Jodhpur - Mehrangarh Fort"></div>
        <div class="marker blue-marker jhalana-leopard-sanctuary" title="Jaipur - Jhalana Leopard Sanctuary"></div>
        <div class="marker blue-marker jaisalmer-desert-national-park" title="Nagaur - Jaisalmer Desert National Park"></div>
    </div>
</body>
</html>
