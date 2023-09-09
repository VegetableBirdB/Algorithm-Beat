:loop 
    @echo off   
    generate.exe > in.txt                       
    java myProject < in.txt  > myout.txt       
    java baoLi < in.txt  > stdout.txt
    fc myout.txt stdout.txt                
if not errorlevel 1   goto loop           
pause