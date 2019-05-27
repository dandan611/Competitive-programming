# Competitive-programming

## infomation 

language：Python3

## input

```
#Class-A 整数の入力(1つ)
a = int(input())

#Class-A スペース区切りの整数の入力(定数)
a, b, c = map(int, input().split())

#Class-A スペース区切りの整数の入力(未知数)
list_num = [num for num in input().split()]

#Class-B 行ごとの入力(n行)
input_list = []
for i in range(n) :
    a = int(input())
    input_list.append(a)

```

## Calculation

```
#Class-A リスト化
list(s)

#Class-A 文字列置換
print(string.replace(","," "))

#Class-B 文字列並び替え
a.sort(reverse=False)

#Class-B 多層リスト等の並び替え
from operator import itemgetter
sorted_list = sorted(input_list, key=itemgetter(1), reverse=True)
sorted_list = sorted(sorted_list, key=itemgetter(0), reverse=False)

#Class-B 文字列結合
mojiretu = ','.join(str_list)

#Class-B for文の途中終了
import sys
s = list(input())
 
for count_s in s:
    if (int(s.count(count_s)%2) != 0) :
        print("No")
        sys.exit()


```

## Output

```
#Class-A 固定桁
"{0:03d}".format(a%1000 + 1)

```


## Reference

* https://note.nkmk.me/python-capitalize-lower-upper-title/
* http://www.isc.meiji.ac.jp/~mizutani/python/sorting.html
* http://nonbiri-tereka.hatenablog.com/entry/2014/08/08/121208
