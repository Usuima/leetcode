int reverse(int x)
{
    int count=0,i=0,flag=0;
    int number[20]={0};
    long newx=0;
    if(x<0)
    {
        flag=1;
        x=0-x;
    }
    for(i=0;x!= 0;i++)
    {
        number[i]= x%10;
        x=x/10;
        count++ ;
    }
    for(i= 0;i<count;i++)
    {
        newx=newx*10+number[i];
    }
    if(flag==1)
        newx=0-newx;
    return (int)newx;
}
