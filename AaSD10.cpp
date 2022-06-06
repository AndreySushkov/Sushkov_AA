#include <iostream>

using namespace std;

class Tree {
public:
    Tree* Left;
    Tree* Right;
    int key;

public:
    Tree(Tree* Left, Tree* Right, int key)
        : Left(Left)
        , Right(Right)
        , key(key)
    {};

    void Add(int new_key) {
        if (new_key < key) {
            if (Left == NULL)
                Left = new Tree(NULL, NULL, new_key);
            else
                Left->Add(new_key);
        }
        else {
            if (Right == NULL)
                Right = new Tree(NULL, NULL, new_key);
            else
                Right->Add(new_key);
        }
    }

    bool Search(int new_key) {
        bool isFind = false;

        if (key > new_key && Left != NULL) {
            if (!isFind)
                isFind = Left->Search(new_key);
        }
        else if (key < new_key && Right != NULL) {
            if (!isFind)
                isFind = Right->Search(new_key);
        }

        if (key == new_key)
            isFind = true;

        return isFind;
    }

    void Print(int tabs) {  //tabs - начальный отступ
        for (int i = 0; i < tabs; i++)
            cout << "\t";
        cout << key << endl;
        if (Left != NULL)
            Left->Print(tabs + 1);
        if (Right != NULL)
            Right->Print(tabs + 1);
    }
};

Tree* createTree(int m, int maxn) {
    Tree* obj = new Tree(NULL, NULL, rand() % maxn+1);

    for (int i = 0; i < m-1; i++) {
        int r = rand() % maxn+1;
        obj->Add(r);
    }

    return obj;
}

int main()
{
    srand(time(NULL));
    setlocale(LC_ALL, "Russian");

    int m = 14; //количество узлов
    int maxn = 120;  //максимальное число в узле

    int search_num = rand() % maxn + 1; //искомое число
    
    Tree* obj = createTree(m, maxn);

    obj->Print(0);

    bool search = obj->Search(search_num);
    if (search)
        cout << "Элемент " << search_num << " есть в дереве" << endl;
    else
        cout << "Элемента " << search_num << " нет в дереве" << endl;
}
