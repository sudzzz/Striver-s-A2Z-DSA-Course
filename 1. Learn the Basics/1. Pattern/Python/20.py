# *        *
# **      **
# ***    ***
# ****  ****
# **********
# ****  ****
# ***    ***
# **      **
# *        *

    
def symmetry(n):
    n = 2*n
    # For loop ‘row’ in range 0 to N-2.
    for row in range(n-1):
        # For loop ‘col’ in range 0 to N-1.
        for col in range(n):
            # Condition for first half of the rows.
            if (row < n/2 and (col <= row or col >= (n-row-1))):
                print('*', end=" ")
            # Condition for the second half of the rows.
            if (row >= n/2 and (col < (n-row-1) or col > row)):
                print('*', end=" ")
            if (row < n/2 and not (col <= row or col >= (n-row-1))):
                print(' ', end=" ")
            if (row >= n/2 and not (col < (n-row-1) or col > row)):
                print(' ', end=" ")
        print()

n = int(input())
symmetry(n)