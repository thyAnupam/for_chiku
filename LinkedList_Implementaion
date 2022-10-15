#include <iostream>
#include <vector>
using namespace std;


class Node
{
  public:
	int key;		
	Node* next; 	
};


Node* newNode(int key, Node* next)
{
	
	Node* node = new Node;
	node->key = key;

	node->next = next;

	return node;
}


Node* constructList(vector<int> const &keys)
{
	Node* head, *node = nullptr;

	
	for (int i = keys.size() - 1; i >= 0; i--)
	{
		node = newNode(keys[i], node);
		head = node;
	}

	return head;
}

int main()
{
	
	vector<int> keys = { 1,2,3,4 };
	
	Node *head = constructList(key);

	return 0;
}
