#!/bin/bash

#link : https://www.hackerrank.com/challenges/bash-tutorials---getting-started-with-conditionals/problem?isFullScreen=true&h_r=next-challenge&h_v=zen

#Read in one character from STDIN.
#If the character is 'Y' or 'y' display "YES".
#If the character is 'N' or 'n' display "NO".
#No other character will be provided as input.


read x 
if [ $x == 'Y' ] || [ $x == 'y' ]
then
    echo "YES"
elif [ $x == 'N' ] || [ $x == 'n' ]
then
    echo "NO"
fi