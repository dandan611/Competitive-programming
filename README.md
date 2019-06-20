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
l = []
for i in range(n) :
    a = int(input())
    l.append(a)

#Class-B 行ごとの入力(行数指定なし)
import sys
a = []
for line in sys.stdin:
    a.append(line.rstrip("\n"))

```

## Calculation

```
#Class-A リスト化
list(s)

#Class-A リスト要素の数え上げ
s.count(s[0])

#Class-A 文字列置換
print(string.replace(","," "))

#Class-A ユークリッドの互除法(最大公約数)
def gcd(x, y):
    if y == 0:
        return x
    else:
        return gcd(y, x%y)

#Class-B 文字列並び替え
a.sort(reverse=False)

#Class-B リストの重複要素を削除 
l_unique = list(set(a))

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
#Class-B リストのqueueとしての利用
a.pop(0)


```

## Output

```
#Class-A 固定桁
"{0:03d}".format(a%1000 + 1)

```

## Output

* 四則演算は、オーバーフローの際に利用する演算子を変えるか検討すること


## Reference

* ABC C問題の練習
  * https://qiita.com/drken/items/e77685614f3c6bf86f44
  * https://qiita.com/drken/items/fd4e5e3630d0f5859067

* 他
  * https://note.nkmk.me/python-capitalize-lower-upper-title/
  * http://www.isc.meiji.ac.jp/~mizutani/python/sorting.html
  * http://nonbiri-tereka.hatenablog.com/entry/2014/08/08/121208
  * http://mzgkworks.hateblo.jp/entry/bitbucket-project
  * https://note.nkmk.me/python-dict-value-max-min/
