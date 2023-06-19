#!/bin/sh

#link : https://www.hackerrank.com/challenges/bash-tutorials---comparing-numbers/problem?isFullScreen=true

#Given two integers,x and y , identify whether greater or smaler or equal.

read x
read y

if [ $x -gt $y ]
then
    echo "X is greater than Y"
elif [ $x -lt $y ]
then
    echo "X is less than Y"
else
    echo "X is equal to Y"
fi