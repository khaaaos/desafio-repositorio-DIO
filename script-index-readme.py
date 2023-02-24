#!/usr/bin/env python
# coding: utf-8

# In[102]:


def update_readme():
    import os
    repo = r'C:\Users\Willer\Documents\Classroom\Git\desafio-repositorio-DIO'
    
    ls = []
    for root, dirs, files in os.walk(repo, topdown=True):
        if '.git' in dirs:
            dirs.remove('.git')
        for name in files:
            ls.append(os.path.join(root, name))
        for name in dirs:
            ls.append(os.path.join(root, name))
    
    ls.sort()
    folder_files = []
    for item in ls:
        folder_files.append(item.replace(repo, '.'))

    res = '\n'.join(folder_files)
    
    os.chdir(r'C:\Users\Willer\Documents\Classroom\Jupyter-lab\script readme')
    with open(file='ls.txt', mode='r', encoding='utf-8') as fp:
        backup = fp.read()
    
    if res != backup:
        with open(file='ls.txt', mode='w', encoding='utf-8') as fp:
            fp.write(res)
        os.chdir(r'C:\Users\Willer\Documents\Classroom\Git\desafio-repositorio-DIO')
        with open(file='README.md', mode='r', encoding='utf-8') as fp:
            readme = fp.read()
    
        end = readme.find('Index:')
        readme = readme[:end+(len('Index:'))]
    
        with open(file='README.md', mode='w', encoding='utf-8') as fp:
            fp.write(readme+'\n')
            for ln in folder_files:
                fp.write(ln+'\n')
    
    os.chdir(repo)
    
    return 1
    


# In[103]:


update_readme()


# In[ ]:




