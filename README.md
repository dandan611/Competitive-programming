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

print("%d %d %.10f"%(a/b,a%b,a/b))

```

## Output

* 四則演算は、オーバーフローの際に利用する演算子を変えるか検討すること


## Algorithm

### 動的計画法

```
# 最大和問題
def max_sum(N,a):
  dp=[0]*(N+1)
  for i in range(N):
    dp[i+1]=max(dp[i],dp[i]+a[i])
  return dp[N]
```

```
# ナップサック問題
def knapsack(N,W,weight,value):
  #初期化
  inf=float("inf")
  dp=[[-inf for i in range(W+1)] for j in range(N+1)]
  for i in range(W+1): dp[0][i]=0

  #DP
  for i in range(N):
    for w in range(W+1):
      if weight[i]<=w: #dp[i][w-weight[i]の状態にi番目の荷物が入る可能性がある
        dp[i+1][w]=max(dp[i][w-weight[i]]+value[i], dp[i][w])
      else: #入る可能性はない
        dp[i+1][w]=dp[i][w]
  return dp[N][W]
```

```
# 部分和問題
def part_sum0(a,A):
  #初期化
  N=len(a)
  dp=[[0 for i in range(A+1)] for j in range(N+1)]
  dp[0][0]=1

  #DP
  for i in range(N):
    for j in range(A+1):
      if a[i]<=j: #i+1番目の数字a[i]を足せるかも
        dp[i+1][j]=dp[i][j-a[i]] or dp[i][j]
      else: #入る可能性はない
        dp[i+1][j]=dp[i][j]
  return dp[N][A]
```


```
# 部分和数え上げ問題
def part_sum(a,A):
  p=10**9+7
  #初期化
  N=len(a)
  dp=[[0 for i in range(A+1)] for j in range(N+1)]
  dp[0][0]=1

  #DP
  for i in range(N):
    for j in range(A+1):
      if a[i]<=j: #i+1番目の数字a[i]を足せるかも
        dp[i+1][j]=dp[i][j-a[i]]+ dp[i][j]% p
      else: #入る可能性はない
        dp[i+1][j]=dp[i][j]%p
  return dp[N][A]
```


```
# 累積和
from itertools import accumulate

N = 5 #要素数
K = 2 #何個要素が続く最大を求めるか
A = [3,4,-2, 8, 9]

B = [0] + A

B = list(accumulate(B)) #累積和
# B = [0, 3, 7, 5, 13, 22]
answer = []

for i in range(N-(K-1)):
    answer.append(B[i+K]-B[i])

print(max(answer))    
```

```
# 尺取り法
right = 0
left = 0
total = 1
max_len = 0

list1 = [4,1,7,2]
K = 6
n = 4

while right < n :
    if total*list1[right] <= k:
        total = total*list1[right]
        right = right+1
        max_len = max(max_len, right-left)

    elif right == left:
        right = right+1
        left = left+1

    else:
        total //= list1[left]
        left = left+1

print(max_len)
```

## 幅優先探索

* リストを利用する

## 深さ優先探索

* 再帰関数を利用する

## TLE list

解けたけど時間が無理だった系

* [ABC]C - Write and Erase
  * 解説のやり方でもTLE、dictionaly型を読み込みの時に作成して、要素があるときに抜くように実装したほうが早い。

## Not Solved list

まったくわからなかった系

* -

## Reference

* ABC C問題の練習
  * https://qiita.com/drken/items/e77685614f3c6bf86f44
  * https://qiita.com/drken/items/fd4e5e3630d0f5859067

* 累積和、いもす法の解説
  * http://puzzleknot.org/study/249/
* http://wakabame.hatenablog.com/entry/2017/09/10/211428

* 他
  * https://note.nkmk.me/python-capitalize-lower-upper-title/
  * http://www.isc.meiji.ac.jp/~mizutani/python/sorting.html
  * http://nonbiri-tereka.hatenablog.com/entry/2014/08/08/121208
  * http://mzgkworks.hateblo.jp/entry/bitbucket-project
  * https://note.nkmk.me/python-dict-value-max-min/
