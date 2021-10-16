#include <bits/stdc++.h>
using namespace std;
int findSubStrCount(string s1,string s2,string x);
vector<string> as1,as2,ax;

vector<string> sub(string s){
    vector<string> arr;
    
    for(int i=0;i<=s.length();i++){
        arr.push_back(s.substr(0,i));
    }
    return arr;
}

int main() {
	ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    string s1,s2,x;
    int n;
    cin>>n;
    for(int i=0;i<n;i++){
        cin>>s1;
        cin>>s2;
        cin>>x;
        cout<<findSubStrCount(s1,s2,x)<<endl;
    }
    
	return 0;
}

int findSubStrCount(string s1,string s2,string x){
    int count=0;
    ax=sub(x);
    as1=sub(s1);
    as2=sub(s2);
    string temp;
    for(int i=0;i<as1.size();i++){
        for(int j=0;j<as2.size();j++){
            temp=as1[i]+as2[j];
            if(x.find(temp)!=string::npos)
                count++;
        }
    }
    return count;
}