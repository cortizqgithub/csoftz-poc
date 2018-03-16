/*----------------------------------------------------------------------------*/
/* Source File:   ILOGGERMANAGER.CS                                           */
/* Description:   Interface definition to handle logging messages for App.    */
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

namespace Account.Owner.Service.Interfaces
{
    /// <summary>
    /// Interface definition to handle logging messages for App.
    /// </summary>
    public interface ILoggerManager
    {
        /// <summary>
        /// Writes to log an Information level message.
        /// </summary>
        /// <param name="message">Information to log</param>
        void Info(string message);

        /// <summary>
        /// Writes to log an Warning level message.
        /// </summary>
        /// <param name="message">Information to log</param>
        void Warn(string message);

        /// <summary>
        /// Writes to log an Debugging level message.
        /// </summary>
        /// <param name="message">Information to log</param>
        void Debug(string message);

        /// <summary>
        /// Writes to log an Error level message.
        /// </summary>
        /// <param name="message">Information to log</param>
        void Error(string message);
    }
}
