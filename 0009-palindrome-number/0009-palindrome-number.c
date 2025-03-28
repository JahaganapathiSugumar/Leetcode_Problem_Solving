bool isPalindrome(int x){
    int dup_num = x;
    int rem;
    long int  sum=0;
    if(x>=-2147483648 && x<=  2147483647)
    {
        for(int i = x;i!=0;i = i/10)
        {
            rem = i%10;
            sum = sum*10 +rem;
        }
        if(dup_num<0 )
        {
            return false;
        }
        else if(dup_num==sum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    else
    {
        return false;
    }
}