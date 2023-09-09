#!/bin/bash
t=0;
while true; do
    let "t = $t + 1"
    printf $t
    printf ":\n"
    ./rand > rand.txt
    ./my < rand.txt > my.out
    ./brute < rand.txt > brute.out
     
    if diff my.out brute.out; then
        printf "\n"
    else
        printf "WA\n"
        cat rand.txt
        break
    fi
done