#include<iostream>
#include<string>
using namespace std;
int main()
{
    bool flag=1;//�������Ƿ�Գ�
    bool fn=1;//�������Ƿ�ÿλ��Ϊ9
    bool fj=0;//�ж������Ƿ�����100...01
    string str;
    string s="";
    cin>>str;
    int i,a,b,len=str.length();
    for(i=0;i<=(len-1)/2;i++){
        if(flag&&str[i]!=str[len-i-1])
            flag=0;
        if(fn&&str[i]!='9')
            fn=0;
        s+=str[i];
    }
    if(!flag){
        cout<<s;
        for(i-=2;i>=0;cout<<str[i--]);//���Գƣ�ֱ��ǰ�벿�ַ������
    }else{
        a=stoi(s);//s�����Ϊ9����int��Χ��
        for(i=10;i<=a;i==a ? fj=1:fj=0,i*=10);
        if(fj)
            cout<<stoi(str)-2<<endl;
        else{
            if(len&1){
                b=a%100;
                b==99 ? a++:(b%10==0&&b!=0 ? a++:a--);
                cout<<a;
                a/=10;
            }else{
                b=a%10;
                b==9 ? a++:a--;
                cout<<a;
            }
            if(fn)    a/=10;
            while(a){
                cout<<a%10;
                a/=10;
            }
        }
    }
}