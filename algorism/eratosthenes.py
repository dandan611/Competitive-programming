# エラトステネスの篩
# （えらとすてねすのふるい）
# 指定された範囲の中から2で割り切れる数、3で割り切れる数、…と割り切れる数を順に除外する方法

import math

def get_prime(n):
    if n<= 1:
        return []
    prime = [2]
    limit = int(math.sqrt(n))

    # 奇数のリストを作成
    data = [i + 1 for i in range(2,n,2)]
    while limit > data[0]:
        prime.append(data[0])
        # 割り切れない数だけを取り出す
        data = [j for j in data if j % data[0] ]

    return prime + data

print(get_prime(200))