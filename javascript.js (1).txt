Generate Summary
void generateSummary(char *text) {
int sentences = 0, words = 0;
for (int i = 0; text[i]!= '\0'; i++) {
if (text[i] == '.' || text[i] == '!' || text[i] == '?') sentences++;
if (text[i] == ' ' || text[i] == '\n') words++;
}

printf("\n--- Document Summary ---\n");
printf("Total Words: %d\n", words);
printf("Total Sentences: %d\n", sentences);
printf("Summary: This document contains %d main points. ", sentences);
if (strstr(text, "Party")!= NULL || strstr(text, "party")!= NULL) {
printf("It is an agreement between two parties. ");
}
printf("Please read all risky clauses before signing.\n");
}
