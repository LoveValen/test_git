# Java 学习分支建议

这个仓库按“主线稳定，练习分支独立”的方式管理。

## 分支用途

- `main`：稳定主线，保留已经整理好的练习清单和通用示例。
- `learning/basic-syntax`：变量、运算符、条件、循环。
- `learning/arrays-strings`：数组、字符串、常见算法题。
- `learning/methods-oop`：方法、类、对象、继承、重载。
- `learning/projects`：学生管理、图书管理等综合练习。

## 建议用法

1. 日常学习时，切到对应专题分支。
2. 每完成 1 到 3 道题就提交一次。
3. 某个专题练完后，再把成果合并回 `main`。

## 常用命令

切换分支：

```bash
git switch learning/basic-syntax
```

查看状态：

```bash
git status
```

提交一次练习：

```bash
git add .
git commit -m "finish exercise 01 to 03"
```

把当前专题合并回主线：

```bash
git switch main
git merge learning/basic-syntax
```
