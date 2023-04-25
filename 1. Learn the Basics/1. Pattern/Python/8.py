# *********
#  ******* 
#   *****  
#   ***   
#     *

for i in range(0,5):
    for j in range(0,i):
        print(" ",end="")
    for j in range(0,10-(2*i+1)):
        print("*",end="")
    for j in range(0,i):
        print(" ",end="")
    print("\r")