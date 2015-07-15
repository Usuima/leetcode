//deterministic finite automation
// input type:invalid,space,sign,number,dot,e or E
// // state of deterministic finite automation:
// state0: 无输入或只有space
// state1：输入了number
// state2: 无数字+dot
// state3: 输入了符号
// state4: 已有number和dot
// state5: 有e或者E输入
// state6: 在e或者E后输入sign
// state7: e+number
// state8: 有效数字+space
bool isNumber(char* s) {
    enum InputType{
        INVALID,SPACE,SIGN,NUMBER,DOT,E
    };
    int fsm[][6]={
        -1,0,3,1,2,-1,
        -1,8,-1,1,4,5,
        -1,-1,-1,4,-1,-1,
        -1,-1,-1,1,2,-1,
        -1,8,-1,4,-1,5,
        -1,-1,6,7,-1,-1,
        -1,-1,-1,7,-1,-1,
        -1,8,-1,7,-1,-1,
        -1,8,-1,-1,-1,-1
    };
    int state=0;
    int i=0;
    while (s[i]!='\0')  
    {  
        enum InputType input = INVALID;  
        if (s[i] == ' ') 
            input = SPACE;  
        else if (s[i] == '+' || s[i] == '-') 
            input = SIGN;  
        else if (s[i]>='0'&&s[i]<='9') 
            input = NUMBER;  
        else if (s[i] == '.') 
            input = DOT;  
        else if (s[i] == 'e' || s[i] == 'E') 
            input = E;  
        state = fsm[state][input];  
        if (state == -1) 
            return false;  
        i++;
    } 
    if(state==1||state==4||state==7||state==8)
        return true;
    else 
        return false;
}
