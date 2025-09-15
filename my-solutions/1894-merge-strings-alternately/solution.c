char * mergeAlternately(char * word1, char * word2)
{
    int strlength1 = strlen(word1);
    int strlength2 = strlen(word2);
    int idx = 0;
    int size=strlength1 + strlength2 + 1;
    char *resultantString = malloc(size);
    while (*word1 || *word2)
    {
        if (*word1)
            resultantString[idx++] = *(word1++);    
        if (*word2)
            resultantString[idx++] = *(word2++);
    }
    resultantString[idx] = '\0';
    return resultantString;
}
