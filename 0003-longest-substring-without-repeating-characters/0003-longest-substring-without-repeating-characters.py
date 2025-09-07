class Solution(object):
    def lengthOfLongestSubstring(self, s):
        begin_of_substring = 0
        last_position_of_char = {}
        result = 0

        for i, ch in enumerate(s):
            if ch in last_position_of_char and last_position_of_char[ch] >= begin_of_substring:
                begin_of_substring = last_position_of_char[ch] + 1
            result = max(result, i - begin_of_substring + 1)
            last_position_of_char[ch] = i

        return result
