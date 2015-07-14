int myAtoi(char* str) {
    int i=0;
    int negetive=0;
    long int num=0;
    while(str[i]==' ')
        i++;
    if(str[i]=='-')
    {
        negetive=1;
        i++;
    }
    else if(str[i]=='+')
    {
        negetive=0;
        i++;
    }
    if(str[i]=='\0'||str[i]<'0'||str[i]>'9')
        return 0;
    else{
        while(str[i]>='0'&&str[i]<='9')
        {
            num=num*10+str[i]-'0';
            if(negetive==0&&num>INT_MAX)
                return INT_MAX;
            else if((0-num)<INT_MIN)
                 return INT_MIN;
            i++;
        }
    }
    if(negetive==1)
        num=0-num;
    if(num>INT_MAX)
        return INT_MAX;
    else if(num<INT_MIN)
        return INT_MIN;
    else 
        return (int)num;
}
