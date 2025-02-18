int longestValidParentheses(char* s) {
    int open=0,close=0,count=0,max=0,i,s1=0,e1=0;
    int c = 0;
    for(int start=0,end=strlen(s)-1;s[start];start++,end--){
        
        if(s[start]=='(') open++;
        else if(s[start]==')')open--;


        if(s[end]==')')close++;
        else if(s[end]=='(')close--;

        if(open==-1){
            s[start]='*';
            open=0;
        }
        if(close==-1){
            s[end]='*';
            close=0;
        }
        
    }
        for(i=0;s[i];i++){
            if(s[i]!='*'){
                count++;
            }else{
                count=0;
            }
            if(count>max){
                max=count;
                s1=i-max;   
                e1=i;  
            }
        }
        
        for(int i=s1+1;i<e1+1;i++){
            c++;
        }

        return c;
    
        
} 