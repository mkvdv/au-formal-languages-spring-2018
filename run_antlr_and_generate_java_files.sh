#!/bin/bash

cd src
antlr4 -Werror L_Lexer.g4 -o ./main/java/ru/spbau/mit/fl/
cd ..