Setup the projects into Eclipse or STS. Let all dependancies get downloaded into the maven repo.

Start the all microservices in the below order:
1. SnakeladderGameDiscoveryServer
2. GameBoard
3. SnakeladderGame



Users:-
User1: Alex
User2: Sam
User3: Jack
User4: Linda

Password is common for all Users: password123




Game API Steps:-

Generate Model - http://localhost:9082/snakeandladder/GenerateGameBoard

Add Players before starting game - http://localhost:9082/snakeandladder/newPlayer

Get Players Details -  http://localhost:9082/snakeandladder/getplayers

Roll A Dice with player id and dice face value - http://localhost:9082/snakeandladder/rolldice/playerig/{playerID}/diceface/{diceface}






Player JSON:

{
    "id": 1,
    "location": {
        "city": "Pune",
        "pincode": 123456,
        "state": "Maharashtra",
        "country": "India"
    },
    "lastFiveGames": {
        "1": "W",
        "2": "L",
        "3": "T",
        "4": "W",
        "5": "L"
    },
    "name": "Akash"
}



W - WIN
L - LOOSE
T - TIE