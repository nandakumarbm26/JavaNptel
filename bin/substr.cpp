#include<iostream>
#include <Vector>
#include<string>
using namespace std;
void sub(string s);
int main(int argc, char const *argv[])
{
    string s="nanda";
    if(s.find("i")!=string::npos)
               cout<<"found";
}


void sub(string s){
    vector<string> arr;
    
    for(int i=0;i<=s.length();i++){
        arr.push_back(s.substr(0,i));
    }
        cout<<arr.size()<<endl;
    for(int i=0;i<=arr.size();i++){
        cout<<arr[i]<<endl;
    }

}