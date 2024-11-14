int numberOfEmployeesWhoMetTarget(int* hours, int hoursSize, int target){

    int c =0,i;
    for(i =0;i<hoursSize;i++){
        if(hours[i] >= target){
            c++;
        }
    }

    return c;
}