. Risky Clause Detector
void detectRiskyClauses(char *text) {
char lower_text[MAX_TEXT];
strcpy(lower_text, text);
toLowerCase(lower_text);

char *risky_keywords[] = {"indemnify", "liability", "penalty", "termination", "breach", "lawsuit", "confidentiality", "non-compete"};
int risky_count = 8;
int found = 0;

printf("\n--- Risk Analysis Report ---\n");
for (int i = 0; i < risky_count; i++) {
if (strstr(lower_text, risky_keywords[i])!= NULL) {
printf("[HIGH RISK] Found clause: '%s' - Please review carefully!\n", risky_keywords[i]);
found = 1;
}
}
if (!found) {
printf("No high-risk clauses found. Document looks safe.\n");
}
}
