#!/bin/sh

# Write a Bash script which accepts name as input and displays the greeting "Welcome (name)"
# https://www.hackerrank.com/challenges/bash-tutorials---a-personalized-echo/problem

read name
# read is a bash built-in command that reads a line from the standard input (or from the file descriptor) and split the line into words.
echo "Welcome $name"
