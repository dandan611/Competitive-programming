
memo = {
        1:1,
        2:1
        }

def fibonacci(n):
    # 辞書のキーに特定の値が含まれているかを判定する
    if n in memo:
        return memo[n]
    
    memo[n] = fibonacci(n-2) + fibonacci(n-1)

    return memo[n]

fibonacci(100)


print(memo)
