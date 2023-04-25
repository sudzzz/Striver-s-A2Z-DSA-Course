/*
    *    
   ***   
  *****  
 ******* 
*********
*/

#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	for(int i=0;i<5;i++){
		    //Space
		    for(int j=0;j<5-i-1;j++){
		        cout << " ";
		    }
		     //Star
		    for(int j=0;j<2*i+1;j++){
		        cout << "*";
		    }
		     //Space
		    for(int j=0;j<5-i-1;j++){
		        cout << " ";
		    }
		    cout << endl;
	}
	return 0;
}
