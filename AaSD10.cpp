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
};


//void PrintTree(Tree* tree) {
//    cout << endl;
//    if (tree->Left != NULL)
//        PrintTree(tree->Left);
//    else
//        cout << "   ";
//    if (tree->Right != NULL)
//        PrintTree(tree->Right);
//    else
//        cout << "   ";
//    cout << tree->key << " ";
//}

int main()
{
    srand(time(NULL));
    setlocale(LC_ALL, "Russian");

    Tree* obj = new Tree(NULL, NULL, 110);

    for (int i = 0; i < 7; i++) {
        int r = rand() % 10;
        obj->Add(r);
    }
    
    bool search = obj->Search(5);
    if (search)
        cout << "Такой элемент есть в дереве" << endl;
    else
        cout << "Такого элемента нет в дереве" << endl;
}
