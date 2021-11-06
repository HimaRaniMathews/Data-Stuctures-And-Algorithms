### BINARY TREE

-  Tree whose elements have at most 2 children is called a binary tree.
-  Tree can have only 2 children, we typically name them the left and right child.

### (1) Node Creation
Binary Tree node contains :
- Data
- Pointer to left child
- Pointer to right child
```
struct node
{
    int data;
    struct node* left;
    struct node* right;
};
```
### (2) Simple creation of tree
```
#include <bits/stdc++.h>
using namespace std;

struct Node {
	int data;
	struct Node* left;
	struct Node* right;
	Node(int val)
	{
		data = val;
		left = NULL;
		right = NULL;
	}
};

int main()
{
	struct Node* root = new Node(1);
	root->left = new Node(2);
	root->right = new Node(3);
	root->left->left = new Node(4);
	return 0;
}

```
