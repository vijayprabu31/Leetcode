bool isIsomorphic(char* s, char* t) {
     int s1= strlen(s),first_s[128]={0},first_t[128]={0};   
    for (int i = 0; i < s1; i++) {
        if (first_s[s[i]] != first_t[t[i]]) return false;
        first_s[s[i]] = i + 1; // use i+1 to avoid 0 (initial value)
        first_t[t[i]] = i + 1;
    }
    return true;
    
}
