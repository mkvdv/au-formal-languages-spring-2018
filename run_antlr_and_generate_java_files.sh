#!/bin/bash

cd src
export CLASSPATH=".:/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH"
java -Xmx500M -cp "/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool -Werror L_Lexer.g4 L_Parser.g4 -o ./main/java/ru/spbau/mit/fl/
cd ..
