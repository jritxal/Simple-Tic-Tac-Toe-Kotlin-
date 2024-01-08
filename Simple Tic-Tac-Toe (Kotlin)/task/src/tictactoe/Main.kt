package tictactoe

import java.lang.NumberFormatException

fun main() {
    // write your code here
    val players = mutableListOf('X', 'O')
    var playerCount = -1
    var draw: Boolean

    var board = "         "

    do {
        printBoard(board)
        playerCount++
        board = makeMove(board, players[playerCount % 2])
        draw = !board.contains(" ")
    } while (!playerWins(players[playerCount % 2], board) && !draw)

    printBoard(board)

    if (playerWins('O', board)) {
        println("O wins")
        return
    }
    if (playerWins('X', board)) {
        println("X wins")
        return
    }
    if (draw) {
        println("Draw")
    }
}

fun playerWins(playerSymbol: Char, input: String): Boolean {
    if (input[0] == playerSymbol && input[1] == playerSymbol && input[2] == playerSymbol) return true
    if (input[3] == playerSymbol && input[4] == playerSymbol && input[5] == playerSymbol) return true
    if (input[6] == playerSymbol && input[7] == playerSymbol && input[8] == playerSymbol) return true
    if (input[0] == playerSymbol && input[3] == playerSymbol && input[6] == playerSymbol) return true
    if (input[1] == playerSymbol && input[4] == playerSymbol && input[7] == playerSymbol) return true
    if (input[2] == playerSymbol && input[5] == playerSymbol && input[8] == playerSymbol) return true
    if (input[0] == playerSymbol && input[4] == playerSymbol && input[8] == playerSymbol) return true
    if (input[6] == playerSymbol && input[4] == playerSymbol && input[2] == playerSymbol) return true
    return false
}

fun printBoard(board: String) {
    println("---------")

    for (i in board.indices) {
        if (i % 3 == 0) {
            print("| ")
        }
        print(board[i])
        print(' ')
        if (i % 3 == 2) {
            print("|\n")
        }
    }
    println("---------")
}

fun makeMove(board: String, player: Char): String {
    var output = ""
    do {
        var moveOk = true
        val move = readln()
        val coordinates = move.split(" ")
        try {
            val x = coordinates[0].toInt()
            val y = coordinates[1].toInt()

            if (x !in 1..3 || y !in 1..3) {
                println("Coordinates should be from 1 to 3!")
                moveOk = false
                continue
            }

            val position = x * 3 - 4 + y

            if (board[position] != ' ') {
                println("This cell is occupied!")
                moveOk = false
                continue
            }

            for (i in board.indices) {
                output += if (i != position) {
                    board[i]
                } else {
                    player
                }
            }

        } catch (e: NumberFormatException) {
            println("You should enter numbers!")
            moveOk = false
        }
    } while (!moveOk)
    return output
}