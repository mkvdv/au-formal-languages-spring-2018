#!/bin/bash

cd src
antlr4 -Werror ./L_Lexer.g4 -o ./src/main/java/ru/spbau/mit/fl/
cd ..