maze = [ [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9],
         [9, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 9],
         [9, 0, 9, 0, 0, 0, 9, 9, 0, 9, 9, 9],
         [9, 0, 9, 9, 0, 9, 0, 0, 0, 9, 0, 9],
         [9, 0, 0, 0, 9, 0, 0, 9, 9, 0, 9, 9], 
         [9, 9, 9, 0, 0, 9, 0, 9, 0, 0, 0, 9], 
         [9, 0, 0, 0, 9, 0, 9, 0, 0, 9, 1, 9], 
         [9, 0, 9, 0, 0, 0, 0, 9, 0, 0, 9, 9], 
         [9, 0, 0, 9, 0, 9, 0, 0, 9, 0, 0, 9], 
         [9, 0, 9, 0, 9, 0, 9, 0, 0, 9, 0, 9], 
         [9, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 9], 
         [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9] ]


def mapprint(depth):
    print("search:"+ str(depth))

    for row in maze:
        print(row)

    print("---------")

def search(x, y ,depth):
    if maze[x][y] == 1:
        print(depth)
        exit()

    # 探索済み 
    maze[x][y] = 2

    mapprint(depth)

    #上下 左右 を 探索 
    if maze[ x - 1][ y] < 2: 
        search(x - 1, y, depth + 1)
    
    if maze[ x + 1][ y] < 2:
        search( x + 1, y, depth + 1)
    
    if maze[ x][ y - 1] < 2: 
        search( x, y - 1, depth + 1)
        
    if maze[ x][ y + 1] < 2: 
        search( x, y + 1, depth + 1)


# スタート 位置( x 座標、 y 座標、 移動 回数) を セット
search(1 , 1 , 0)