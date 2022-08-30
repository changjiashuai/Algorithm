/**
 * Definition for a binary tree node.
 */
class TreeNode(var value: Int = 0) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
    val pPath = getPath(root, p)
    val qPath = getPath(root, q)
    var i = 0
    var ancestor: TreeNode? = null
    while (i < pPath.size && i < qPath.size) {
        if (pPath[i] == qPath[i]) {
            ancestor = pPath[i]
        } else {
            break
        }
        i++
    }
    return ancestor
}

private fun getPath(root: TreeNode?, target: TreeNode?): List<TreeNode?> {

    val nodes = ArrayList<TreeNode?>()
    var curNode: TreeNode? = root
    while (curNode != null && target != null && curNode != target) {
        nodes.add(curNode)
        curNode = if (target.value < curNode.value) {
            curNode.left
        } else {
            curNode.right
        }
    }
    nodes.add(curNode)
    return nodes
}