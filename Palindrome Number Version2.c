int reverse(int x)
{
    int count=0,i=0,flag=0;
    int number[20]={0};
    long newx=0;
    long oldx=x;
    if(oldx<0)
    {
        flag=1;
        oldx=0-oldx;
    }
    for(i=0;oldx!= 0;i++)
    {
        number[i]= oldx%10;
        oldx=oldx/10;
        count++ ;
    }
    for(i= 0;i<count;i++)
    {
        newx=newx*10+number[i];
    }
    
    if(flag==1)
    {
        newx=0-newx;
    }
    if(newx>INT32_MAX||newx<INT32_MIN)
        return 0;
    else
        return (int)newx;
}
bool isPalindrome(int x) {
    if(x>=0&&x==reverse(x))
        return true;
    else return false;
}