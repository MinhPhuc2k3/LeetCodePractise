#include <string>

using namespace std;

class Solution {
private:
    bool posMatch(const string& s, const string& p, int i, int j) {
        if (i == s.length()) {
            if (j == p.length()) {
                return true;
            } else if (j + 1 < p.length() && p[j + 1] == '*') {
                return posMatch(s, p, i, j + 2);
            } else {
                return false;
            }
        }
        
        if (j == p.length()) {
            return false;
        }
        
        if (s[i] == p[j] || p[j] == '.') {
            if (j + 1 < p.length() && p[j + 1] == '*') {
                return posMatch(s, p, i + 1, j) || posMatch(s, p, i, j + 2);
            } else {
                return posMatch(s, p, i + 1, j + 1);
            }
        } else {
            if (j + 1 < p.length() && p[j + 1] == '*') {
                return posMatch(s, p, i, j + 2);
            }
            return false;
        }
    }
    
public:
    bool isMatch(string s, string p) {
        return posMatch(s, p, 0, 0);
    }
};
