#!/bin/sh

# Link : https://www.hackerrank.com/challenges/bash-tutorials---the-world-of-numbers/problem?isFullScreen=true&h_r=next-challenge&h_v=zen

# Given two integers, X and Y, find their sum, difference, product, and quotient.
#Input Format
#Two lines containing one integer each ( and , respectively).
#Constraints

read x
read y
echo $(($x + $y))
echo $(($x - $y))
echo $(($x * $y))
echo $(($x / $y))
