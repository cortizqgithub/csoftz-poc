/*----------------------------------------------------------------------------*/
/* Source File:   REPOSITORYCONTEXT.CS                                        */
/* Description:   Defines the context for retrieving data from database       */
/* Author:        Carlos Adolfo Ortiz Quirós (COQ)                            */
/* Date:          Mar.16/2018                                                 */
/* Last Modified: Mar.16/2018                                                 */
/* Version:       1.1                                                         */
/* Copyright (c), 2018 CSoftZ.                                                */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Mar.16/2018 COQ  File created.
 -----------------------------------------------------------------------------*/


using Microsoft.EntityFrameworkCore;
               
namespace Account.Owner.Entity
{
    /// <summary>
    /// Defines the context for retrieving data from database
    /// </summary>
    public class RepositoryContext : DbContext
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="T:Account.Owner.Entity.RepositoryContext"/> class.
        /// </summary>
        /// <param name="options">Options.</param>
        public RepositoryContext(DbContextOptions options) : base(options)
        {
        }

        public DbSet<OwnerEntity> Owners { get; set; }
        public DbSet<AccountEntity> Accounts { get; set; }
    }
}
