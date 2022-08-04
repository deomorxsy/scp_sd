#!/usr/bin/python3
import subprocess as sp

def main():
    # Step 1
    '''
    commit_msg = input('Commit msg: ')
    sp.run(['git', 'commit', '-m', '\"{}\"'.format(commit_msg)])
    '''
    # Step 2
    branch_name = sp.run(['git','rev-parse', '--abbrev-ref',  'HEAD'], capture_output=True)

    decodado = branch_name.stdout.decode('utf-8')
    sp.run(['git', 'push', '-u', 'origin', '{}'.format(decodado[0:len(decodado)-1])])


    print(decodado[0:len(decodado)-1])
    print('Pushado!!')

if __name__ == '__main__':
    main()
