/*----------------------------------------------------------------------------*/
/* Source File:   ACCOUNTENTITY.CS                                            */
/* Description:   Defines a mapping to a relationaL table (ACCOUNT)           */
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

using System;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
 
namespace Account.Owner.Entity
{
    /// <summary>
    /// Defines a mapping to a relationaL table (ACCOUNT)
    /// </summary>
    public class AccountEntity
    {
        [Key]
        public Guid AccountId { get; set; }

        [Required(ErrorMessage = "Date created is required")]
        public DateTime DateCreated { get; set; }

        [Required(ErrorMessage = "Account type is required")]
        public string AccountType { get; set; }

        [Required(ErrorMessage = "Owner Id is required")]
        public Guid OwnerId { get; set; }
    }
}
