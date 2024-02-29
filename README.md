# Day8-String-Part2
●28. 实现 strStr()

暴力解法：O（N * M）从i=0开始求substring是否与目标字符串相等。

KMP解法：O（N + M）

先求next数组：

初始化 j = 0 next[0] = j 这里j代表的是最大相等前后缀长度

前后缀不相等 j 后退到next[j - 1] 位置，注意要用while loop 一直后退直到相等或者j = 0

前后缀相等 j++

next数组赋值 next[i] = j

对比：

初始化： j = 0, i = 0 这里j代表的是目前匹配的字符长度

i，j 所处的字符不相等，j后退到0或者相等的位置

i，j所处字符相等，j++。匹配长度++

j = 匹配字符串长度，return i + 1 - 字符串长度

●459.重复的子字符串

 两种做法：

 1. s+s 然后去头去尾，如果新的String还contains s，那return true

 2. 先求next数组，然后用长度 module 长度减去最长相等前后缀（next[len - 1]），如果是0代表return true

●字符串总结 


●双指针回顾 
